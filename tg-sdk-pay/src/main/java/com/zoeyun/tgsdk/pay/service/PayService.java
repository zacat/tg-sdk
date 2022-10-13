package com.zoeyun.tgsdk.pay.service;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.request.pay.*;
import com.zoeyun.tgsdk.pay.bean.result.pay.*;

public interface PayService {

    AllQrcodePayResult allQrcodePay(AllQrcodePayRequest request) throws ErrorException;

    OrderQueryResult orderQuery(OrderQueryRequest request) throws ErrorException;

    CloseTradeOrderResult closeTradeOrder(CloseTradeOrderRequest request) throws ErrorException;
}
