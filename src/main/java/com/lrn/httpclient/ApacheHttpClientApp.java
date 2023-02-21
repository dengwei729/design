package com.lrn.httpclient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.alibaba.fastjson.JSON;

import org.apache.hc.client5.http.async.HttpAsyncClient;
import org.apache.hc.client5.http.async.methods.SimpleHttpRequest;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.async.methods.SimpleRequestBuilder;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.HttpEntities;
import org.apache.hc.core5.http.io.entity.StringEntity;

/**
 * @author 邓伟
 * @date 2023/02/21
 * @since 2023/2/21 4:19 PM
 */
public class ApacheHttpClientApp extends AbstractHttpClient {
    public void invoke() {
        try {
            CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
            client.start();
            final SimpleHttpRequest request = SimpleRequestBuilder
                .get()
                .setUri(URLConstans.URL)
                .build();

            Future<SimpleHttpResponse> future = client.execute(request, new FutureCallback<SimpleHttpResponse>() {
                @Override
                public void completed(SimpleHttpResponse simpleHttpResponse) {
                    String response = simpleHttpResponse.getBodyText();
                    System.out.println("response:" + response);
                }

                @Override
                public void failed(Exception e) {
                    System.out.println("response:" + e) ;
                }

                @Override
                public void cancelled() {
                    System.out.println("cancel:") ;
                }
            });

            SimpleHttpResponse response = future.get();

            System.out.println(response.getCode());
            System.out.println(response.getReasonPhrase());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
    public void invokePost() {
        StringEntity entity = new StringEntity(prepareRequest());
        HttpPost httpPost = new HttpPost(URLConstans.POST_URL);

        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        try {
            CloseableHttpClient client = HttpClients.createDefault();
            CloseableHttpResponse response = client.execute(httpPost);

            System.out.println(response.getCode());
            System.out.println(response.getReasonPhrase());

            HttpEntity entity1 = response.getEntity();
            if (entity1 != null) {
                String result = EntityUtils.toString(entity1);
                System.out.println(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws URISyntaxException {
        ApacheHttpClientApp client = new ApacheHttpClientApp();
        client.invoke();
        client.invokePost();
    }
}
