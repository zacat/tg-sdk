package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class WxJsPayOrderResult extends BaseResult {

    /**
     * 通莞订单号
     */
    String upOrderId;


    /**
     * json格式的字符串，作用于原生态js支付是的参数
     */
    String pay_info;

    /**
     * 微信禁用pay_url,返参为null
     */
    String pay_url;



}
