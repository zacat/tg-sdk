package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MicroPayOrderResult extends BaseResult {

    /**
     * 通莞金服订单号
     */
    String upOrderId;

    /**
     * 支付金额
     */
    String payMoney;

    /**
     * 支付方式 0：微信，1：支付宝，2：银联扫 码 6：龙支付 8 ：翼支付，H：数字货币 （若不传该参 数，则呈现根据付款码自动判断付款方式
     */
    String payType;

    /**
     * 支付时间
     */
    String payTime;

    /**
     * 支付方式为微信支付的时候返回消费者在该商户appid下的唯一标识；支付方式为支付宝是返回用户支付宝的账户名
     */
    String openId;

    /**
     * 0：成功，1：失败，2：已撤销，4：待支付(扫码支付时,银联第一次固定返回4，需要调用查询接口确认支付状态,第一次可以间隔1秒后查询，之后查询需要间隔5秒以上)
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


    /**
     * 接口extendInfo传Y时，若订单有优惠信息则有返回。（扩展信息 字符型，需转换成json对象）
     */
    String extendInfo;
}
