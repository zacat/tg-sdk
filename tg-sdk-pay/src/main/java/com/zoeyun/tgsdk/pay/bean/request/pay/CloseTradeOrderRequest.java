package com.zoeyun.tgsdk.pay.bean.request.pay;

import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseRequest;
import lombok.*;
import org.apache.commons.lang3.StringUtils;


@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class CloseTradeOrderRequest extends BaseRequest {

    /**
     * 下游订单号（与通莞订单号二选一）
     */
    String lowOrderId;

    /**
     * 通莞订单号（与下游订单号二选一）
     */
    String upOrderId;

    @Override
    protected void checkConstraints() throws ErrorException {
        if (StringUtils.isEmpty(lowOrderId) && StringUtils.isEmpty(upOrderId)) {
            throw new ErrorException("订单查询 lowOrderId 和 upOrderId 参数必须2选1");
        }
    }
}
