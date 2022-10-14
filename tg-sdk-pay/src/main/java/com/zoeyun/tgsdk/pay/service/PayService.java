package com.zoeyun.tgsdk.pay.service;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.request.pay.*;
import com.zoeyun.tgsdk.pay.bean.result.pay.*;

public interface PayService {

    AllQrcodePayResult allQrcodePay(AllQrcodePayRequest request) throws ErrorException;

    OrderQueryResult orderQuery(OrderQueryRequest request) throws ErrorException;

    CloseTradeOrderResult closeTradeOrder(CloseTradeOrderRequest request) throws ErrorException;

    UnifiedOrderResult unifiedOrder(UnifiedOrderRequest request) throws ErrorException;

    WxJsPayOrderResult wxJsPayOrder(WxJsPayOrderRequest request) throws ErrorException;

    MicroPayOrderResult microPayOrder(MicroPayOrderRequest request) throws ErrorException;

    DecpJsPayOrderResult decpJsPayOrder(DecpJsPayOrderRequest request) throws ErrorException;

    QueryRefundOrderResult queryRefundOrder(QueryRefundOrderRequest request) throws ErrorException;

    QueryRefundOrderListResult queryRefundOrder(QueryRefundOrderListRequest request) throws ErrorException;

    ReverseOrderResult reverseOrder(ReverseOrderRequest request) throws ErrorException;

    RefundOrderResult refundOrder(RefundOrderRequest request) throws ErrorException;
}
