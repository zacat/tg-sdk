package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.alibaba.fastjson2.annotation.JSONField;
import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DecpJsPayOrderResult extends BaseResult {

    /**
     * 微信禁用pay_url,返参为null
     */
    @JSONField(name = "pay_url")
    String payUrl;

    /**
     * 成功返回，原生js支付信息
     */
    @JSONField(name = "pay_info")
    String payInfo;


}
