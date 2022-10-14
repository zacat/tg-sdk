package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ReverseOrderResult extends BaseResult {

    /**
     * 聚合账户
     */
    String account;

    /**
     * 下游订单号
     */
    String lowOrderId;

    /**
     * 通莞订单号
     */
    String upOrderId;

    /**
     * 0：成功，1：失败，2：已撤销 5：已退款申请成功 6：已转入部分退款申请成功
     */
    String state;
}
