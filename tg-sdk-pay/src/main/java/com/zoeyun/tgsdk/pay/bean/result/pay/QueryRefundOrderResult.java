package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class QueryRefundOrderResult extends BaseResult {

    /**
     * 通莞订单号
     */
    String orderId;

    /**
     * 下游退款订单号
     */
    String lowRefundNo;

    /**
     * 通莞退款订单号
     */
    String refundNo;

    /**
     * 0：支付成功，1：支付失败，2：已撤销 5：已退款申请成功 6：已转入部分退款申请成功
     */
    String state;

    /**
     * 退款时间
     */
    String refundTime;

    /**
     * 0：退款成功，1：退款失败，2退款中
     */
    String refundState;

    /**
     * 退款金额
     */
    String refundMoney;

    /**
     * 备注
     */
    String remark;

    /**
     * 渠道ID
     */
    String channelId;
}
