package com.zoeyun.tgsdk.pay.config.impl;

import com.zoeyun.tgsdk.pay.config.PayConfig;
import lombok.Data;

import java.io.Serializable;

@Data
public class PayConfigImpl implements PayConfig, Serializable {

    private static final long serialVersionUID = -5234628670973234280L;

    protected volatile String mchId;
    protected volatile String mchKey;
    protected volatile String payBaseUrl;
    protected volatile int httpConnectionTimeout = 5000;
    private int httpTimeout = 10000;
    private boolean useSandboxEnv = false;


}
