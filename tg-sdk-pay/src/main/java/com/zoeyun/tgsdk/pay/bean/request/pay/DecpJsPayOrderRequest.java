package com.zoeyun.tgsdk.pay.bean.request.pay;

import com.zoeyun.tgsdk.annotation.Required;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseRequest;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class DecpJsPayOrderRequest extends BaseRequest {

    /**
     * 下游订单号
     */
    @Required
    String lowOrderId;

    /**
     * 支付金额，单位元
     */
    @Required
    String payMoney;

    /**
     * 商品描述
     */
    @Required
    String body;

    /**
     * 通知回调地址
     */
    @Required
    String notifyUrl;

    @Override
    protected void checkConstraints() throws ErrorException {

    }
}
