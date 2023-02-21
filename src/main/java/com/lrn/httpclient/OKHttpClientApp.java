package com.lrn.httpclient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/**
 * @author 邓伟
 * @date 2023/02/21
 * @since 2023/2/21 4:38 PM
 */
public class OKHttpClientApp extends AbstractHttpClient {
    @Override
    public void invoke() {
        OkHttpClient client = new OkHttpClient.Builder()
            .readTimeout(1000, TimeUnit.MILLISECONDS)
            .writeTimeout(1000, TimeUnit.MILLISECONDS)
            .build();

        Request request = new Request.Builder()
            .url(URLConstans.URL)
            .get()
            .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                System.out.println(response.body().string());
            }
        });
    }

    @Override
    public void invokePost() {
        try {
            OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.MILLISECONDS)
                .writeTimeout(1000, TimeUnit.MILLISECONDS)
                .build();
            String requestBody = prepareRequest();
            RequestBody body = RequestBody.create(requestBody, MediaType.parse("application/json"));

            Request request = new Request.Builder()
                .url(URLConstans.POST_URL)
                .post(body)
                .build();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws URISyntaxException {
        OKHttpClientApp client = new OKHttpClientApp();
        client.invoke();
        client.invokePost();
    }
}
