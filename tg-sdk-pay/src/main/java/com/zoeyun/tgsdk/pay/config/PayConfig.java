package com.zoeyun.tgsdk.pay.config;

public interface PayConfig {

    String getMchId();
    void setMchId(String mchId);

    String getMchKey();
    void setMchKey(String mchKey);

    String getPayBaseUrl();
    void setPayBaseUrl(String payBaseUrl);


    int getHttpConnectionTimeout();
    void setHttpConnectionTimeout(int httpConnectionTimeout);

    int getHttpTimeout();
    void setHttpTimeout(int httpTimeout);

}
