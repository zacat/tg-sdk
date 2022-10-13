package com.zoeyun.tgsdk.pay.bean.notify.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PayOrderNotifyResult extends BaseResult {

    /**
     * 下游订单号
     */
    String lowOrderId;

    /**
     * 通莞金服订单号
     */
    String upOrderId;

    /**
     * 聚合支付账号
     */
    String account;

    /**
     * 通莞金服商户编号
     */
    String merchantId;

    /**
     * 支付方式（WX:微信 ,ZFB：支付宝）
     */
    String channelId;

    /**
     * 订单状态（0：成功，1：失败）
     */
    String state;
    /**
     * 订单描述
     */
    String orderDesc;

    /**
     * 支付时间
     */
    String payTime;

    /**
     * 消费者openid
     */
    String openid;

    /**
     * 附加信息
     */
    String attach;

    /**
     * 渠道编码
     */
    String settlementChannel;

    /**
     * 结算结果 默认为null
     */
    String payoffType;
}
