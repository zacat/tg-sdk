package com.zoeyun.tgsdk.pay.bean.request.pay;

import com.zoeyun.tgsdk.annotation.Required;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseRequest;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderRequest extends BaseRequest {
    /**
     * 下游订单号（与通莞订单号二选一）
     */
    String lowOrderId;

    /**
     * 通莞订单号（与下游订单号二选一）
     */
    String upOrderId;

    /**
     * 退款金额单位元
     */
    @Required
    String refundMoney;

    /**
     * 分账订单退款时，可以指定从分账方退还分账金额（乐刷不需要）
     */
    String accountDivided;


    @Override
    protected void checkConstraints() throws ErrorException {
        if (StringUtils.isEmpty(lowOrderId) && StringUtils.isEmpty(upOrderId)) {
            throw new ErrorException("订单查询 lowOrderId 和 upOrderId 参数必须2选1");
        }
    }
}
