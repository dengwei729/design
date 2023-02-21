package com.lrn.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.HashMap;

import com.alibaba.fastjson.JSON;

/**
 * @author 邓伟
 * @date 2023/02/21
 * @since 2023/2/21 3:39 PM
 */
public class HttpClientApp extends AbstractHttpClient {

    @Override
    public void invoke() {
        try {
            HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).followRedirects(Redirect.NORMAL).build();

            HttpRequest request = HttpRequest.newBuilder().uri(new URI(URLConstans.URL))
                .timeout(Duration.ofSeconds(10)).GET().build();

            client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println)
                .join();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void invokePost() {
        try {
            String requestBody = prepareRequest();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://getman.cn/echo"))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("Accept", "application/json")
                .build();

            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body());
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws URISyntaxException {
        HttpClientApp client = new HttpClientApp();
        client.invoke();
        client.invokePost();
    }
}
