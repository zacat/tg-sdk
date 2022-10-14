package com.zoeyun.tgsdk;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.request.pay.AllQrcodePayRequest;
import com.zoeyun.tgsdk.pay.bean.result.pay.AllQrcodePayResult;
import com.zoeyun.tgsdk.pay.config.PayConfig;
import com.zoeyun.tgsdk.pay.config.impl.PayConfigImpl;
import com.zoeyun.tgsdk.pay.service.TgService;
import com.zoeyun.tgsdk.pay.service.impl.TgServiceApacheHttpImpl;

public class TestAllOrderCode {

    public static void main(String[] args) throws ErrorException {
        PayConfigImpl payConfig = new PayConfigImpl();
        payConfig.setMchId("13974747474");
        payConfig.setMchKey("8b86f6b95b99ddb2d8a263f0094174f5");
        payConfig.setUseSandboxEnv(true);

        TgService tgService = new TgServiceApacheHttpImpl();
        tgService.setConfig(payConfig);

        AllQrcodePayRequest allQrcodePayRequest = AllQrcodePayRequest
                .newBuilder()
                .lowOrderId("1438785779286433792")
                .payMoney("0.01")
                .body("商品购买")
                .build();

        AllQrcodePayResult allQrcodePayResult = tgService.getPayService().allQrcodePay(allQrcodePayRequest);
        System.out.println(allQrcodePayResult.getCodeUrl());
    }
}
