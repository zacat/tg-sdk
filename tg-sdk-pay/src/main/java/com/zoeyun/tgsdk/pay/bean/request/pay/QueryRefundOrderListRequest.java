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
public class QueryRefundOrderListRequest extends BaseRequest {

    /**
     * 通莞订单号
     */
    @Required
    String upOrderId;

    @Override
    protected void checkConstraints() throws ErrorException {

    }
}
