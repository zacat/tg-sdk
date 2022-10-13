package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class OrderQueryResult extends BaseResult {

    /**
     * 上游订单号
     */
    String channelOrderId;

    /**
     * 通莞订单号
     */
    String upOrderId;

    /**
     * 结算结果 默认为null
     */
    String payoffType;

    /**
     * 支付时间
     */
    String payTime;

    /**
     * 支付方式为微信支付的时候返回消费者在该商户appid下的唯一标识；支付方式为支付宝是返回用户支付宝的账户名
     */
    String openid;

    /**
     * 结算渠道编号
     */
    String settlementChannel;


    /**
     * 下游订单号
     */
    String lowOrderId;

    /**
     * 支付金额，单位元
     */
    String payMoney;

    /**
     * 支付方式0：微信，1：支付宝，2：银联扫 码 6：龙支付 8 ：翼支付，H：数字货币
     */
    String payType;

    /**
     * 0：成功，1：失败，2：已撤销 4:待支付 5:已转入退款 6:已转入部分退款
     */
    String state;

    /**
     * 订单备注
     */
    String attach;

    /**
     * 聚合账户
     */
    String account;

    /**
     * 支付方式例：WX、ZFB、YZF、LZF、YLZF
     */
    String channelId;

    /**
     * 渠道优惠金额 单位：分
     */
    String discountInfo;

    /**
     * 接口extendInfo传Y时，若订单有优惠信息则有返回。（扩展信息 字符型，需转换成json对象）
     */
    String extendInfo;
}
