package com.zoeyun.tgsdk.pay.config;

public interface PayConfig {

    String getMchId();

    String getMchKey();

    String getPayBaseUrl();

    int getHttpConnectionTimeout();

    int getHttpTimeout();

    Boolean getUseSandboxEnv();
}
