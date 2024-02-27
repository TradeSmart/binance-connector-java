package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

import java.time.Duration;

public class OkHttpClientBuilder {
    private final static int PING_INTERVAL = 10;
    public static OkHttpClient.Builder builder = new OkHttpClient.Builder().pingInterval(Duration.ofSeconds(PING_INTERVAL));
}