package com.zoeyun.tgsdk.pay.service.impl;

import com.zoeyun.tgsdk.pay.config.PayConfig;
import com.zoeyun.tgsdk.pay.service.PayService;
import com.zoeyun.tgsdk.pay.service.TgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class BaseTgServiceImpl implements TgService {

    final Logger log = LoggerFactory.getLogger(this.getClass());
    PayService payService = new PayServiceImpl(this);
    PayConfig payConfig;

    @Override
    public String getPayBaseUrl() {
        return payConfig.getPayBaseUrl();
    }

    @Override
    public void setConfig(PayConfig payConfig) {
        this.payConfig = payConfig;
    }

    @Override
    public PayConfig getConfig() {
        return payConfig;
    }

    @Override
    public PayService getPayService() {
        return this.payService;
    }
}
