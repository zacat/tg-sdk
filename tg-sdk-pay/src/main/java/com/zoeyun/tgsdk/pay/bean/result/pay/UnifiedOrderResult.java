package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class UnifiedOrderResult extends BaseResult {

    /**
     * 订单二维码url
     */
    String codeUrl;

    /**
     * 通莞金服订单
     */
    String orderId;

    /**
     * 4：待支付
     */
    String state;

    /**
     * 下游订单号
     */
    String lowOrderId;

    /**
     * 聚合支付账号
     */
    String account;
}
