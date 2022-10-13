package com.zoeyun.tgsdk.pay.service;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.config.PayConfig;

public interface TgService {

    String getPayBaseUrl();


    void setConfig(PayConfig payConfig);

    PayConfig getConfig();

    /**
     * 发送post请求，得到响应字符串.
     *
     * @param url        请求地址
     * @param requestStr 请求信息
     * @return 返回请求结果字符串 string
     * @throws ErrorException the wx pay exception
     */
    String post(String url, String requestStr) throws ErrorException;

    PayService getPayService();
}
