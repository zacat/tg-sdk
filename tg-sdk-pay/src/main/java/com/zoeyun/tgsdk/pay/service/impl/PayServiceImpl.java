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

    @Override
    public UnifiedOrderResult unifiedOrder(UnifiedOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/unifiedorder";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        UnifiedOrderResult result = BaseResult.fromJSON(responseContent, UnifiedOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public WxJsPayOrderResult wxJsPayOrder(WxJsPayOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/wxJspay";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        WxJsPayOrderResult result = BaseResult.fromJSON(responseContent, WxJsPayOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public MicroPayOrderResult microPayOrder(MicroPayOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/micropay";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        MicroPayOrderResult result = BaseResult.fromJSON(responseContent, MicroPayOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public DecpJsPayOrderResult decpJsPayOrder(DecpJsPayOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/decpJsPay";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        DecpJsPayOrderResult result = BaseResult.fromJSON(responseContent, DecpJsPayOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public QueryRefundOrderResult queryRefundOrder(QueryRefundOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/queryRefund";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        QueryRefundOrderResult result = BaseResult.fromJSON(responseContent, QueryRefundOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public QueryRefundOrderListResult queryRefundOrder(QueryRefundOrderListRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/payApi/queryRefundList";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        QueryRefundOrderListResult result = BaseResult.fromJSON(responseContent, QueryRefundOrderListResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public ReverseOrderResult reverseOrder(ReverseOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/reverse";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        ReverseOrderResult result = BaseResult.fromJSON(responseContent, ReverseOrderResult.class);
        result.checkResult(tgService, true);
        return result;
    }

    @Override
    public RefundOrderResult refundOrder(RefundOrderRequest request) throws ErrorException {
        String url = this.tgService.getPayBaseUrl() + "/tgPosp/services/payApi/refund";
        request.checkAndSign(tgService.getConfig());
        String responseContent = this.tgService.post(url, request.toJSONString());
        RefundOrderResult result = BaseResult.fromJSON(responseContent, RefundOrderResult   .class);
        result.checkResult(tgService, true);
        return result;
    }
}
