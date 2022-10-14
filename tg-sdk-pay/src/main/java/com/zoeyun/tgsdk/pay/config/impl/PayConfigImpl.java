package com.zoeyun.tgsdk.pay.config.impl;

import com.zoeyun.tgsdk.pay.config.PayConfig;
import lombok.Data;

import java.io.Serializable;

@Data
public class PayConfigImpl implements PayConfig, Serializable {

    private static final long serialVersionUID = -5234628670973234280L;

    private static final String DEFAULT_PAY_BASE_URL = "https://tgpay.833006.net/";
    private static final String DEFAULT_SANDBOX_PAY_BASE_URL = "https://tgpay.833006.net";
    protected volatile String mchId;
    protected volatile String mchKey;
    protected volatile int httpConnectionTimeout = 5000;
    private int httpTimeout = 10000;
    private boolean useSandboxEnv = false;

    @Override
    public Boolean getUseSandboxEnv() {
        return useSandboxEnv;
    }

    @Override
    public String getPayBaseUrl() {
        if (useSandboxEnv) {
            return DEFAULT_SANDBOX_PAY_BASE_URL;
        }
        return DEFAULT_PAY_BASE_URL;
    }


}
