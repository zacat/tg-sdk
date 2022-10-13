package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CloseTradeOrderResult extends BaseResult {

    /**
     * 聚合账号
     */
    String account;
    /**
     * 通莞订单号
     */
    String upOrderId;
}
