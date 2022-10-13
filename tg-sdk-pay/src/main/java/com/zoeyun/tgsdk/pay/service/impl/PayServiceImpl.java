package com.zoeyun.tgsdk.pay.service.impl;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseResult;
import com.zoeyun.tgsdk.pay.bean.request.pay.*;
import com.zoeyun.tgsdk.pay.bean.result.pay.*;
import com.zoeyun.tgsdk.pay.service.PayService;
import com.zoeyun.tgsdk.pay.service.TgService;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class PayServiceImpl implements PayService {

    private final TgService tgService;

    @Override
    public AllQrcodePayResult allQrcodePay(AllQrcodePayRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/allQrcodePay";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        AllQrcodePayResult result = BaseResult.fromJSON(responseContent, AllQrcodePayResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public OrderQueryResult orderQuery(OrderQueryRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/orderQuery";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        OrderQueryResult result = BaseResult.fromJSON(responseContent, OrderQueryResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public CloseTradeOrderResult closeTradeOrder(CloseTradeOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/closeTradeOrder";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        CloseTradeOrderResult result = BaseResult.fromJSON(responseContent, CloseTradeOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }
}
