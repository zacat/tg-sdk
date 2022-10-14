package com.zoeyun.tgsdk.pay.bean.request.pay;

import com.zoeyun.tgsdk.annotation.Required;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseRequest;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class QueryRefundOrderRequest extends BaseRequest {

    /**
     * 下游退款订单号(即lowRefundNo)
     */
    @Required
    String refundNo;

    @Override
    protected void checkConstraints() throws ErrorException {

    }
}
