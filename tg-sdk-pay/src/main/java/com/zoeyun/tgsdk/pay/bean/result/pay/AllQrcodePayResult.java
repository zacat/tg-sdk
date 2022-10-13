package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AllQrcodePayResult extends BaseResult {

    /**
     * URL地址供终端生成二维码or直接打开此url
     */
    String codeUrl;

    /**
     * 通莞订单号
     */
    String orderId;
}
