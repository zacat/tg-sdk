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
public class WxPayOrderRequest extends BaseRequest {


    /**
     * 下游订单号
     */
    @Required
    String lowOrderId;

    /**
     * 单位元
     */
    @Required
    String payMoney;

    /**
     * 商品
     */
    @Required
    String body;

    /**
     * 回调通知地址
     */
    @Required
    String notifyUrl;

    /**
     * 支付完成前端返回地址
     */
    @Required
    String returnUrl;

    /**
     * 附加字段
     */
    String attach;

    /**
     * 商户自己上送appID
     */
    @Required
    String appId;

    /**
     * 微信用户在公众号的唯一标识
     */
    @Required
    String openId;

    /**
     * 门店号
     */
    String storeId;

    /**
     * 值为1，表示小程序支付；值为0，表示公众号支付
     */
    String isMinipg;

    /**
     * 易宝渠道使用REAL_TIME("实时订单");
     * REAL_TIME_DIVIDE("实时分账");
     * SPLIT_ACCOUNT_IN("实时拆分入账");
     * DELAY_SETTLE("延迟结算");
     */
    String fundProcessType;

    /**
     * 易宝渠道使用 拆分入账/实时分账，分账详情；
     * 资金处理类型为:
     * REAL_TIME_ DIVIDE("实时分账"),
     * SPLIT_ACCOUNT_IN( "实时拆分入账")时，必填
     */
    String divideDetail;

    /**
     * 易宝渠道使用 实时分账回告商户地址资金处理类型为： REAL_TIME_DIVIDE("实时分账")时，必填，
     * 分账回调需要等渠道分账成功之后才会回调，一般在实时分账后半小时左右
     */
    String divideNotifyUrl;

    /**
     * 乐刷和微信渠道使用，Y表示分账订单，其他表示订单不分账
     */
    String profitSharing;

    /**
     * 下游收银员编号
     */
    String lowCashier;

    /**
     * 医疗场景值，医疗机构必传，其他非必传
     */
    String secenType;

    @Override
    protected void checkConstraints() throws ErrorException {
        if (StringUtils.isNotEmpty(divideDetail) && (divideDetail.equals("REAL_TIME_ DIVIDE") || divideDetail.equals("SPLIT_ACCOUNT_IN"))) {
            throw new ErrorException("资金处理类型为: REAL_TIME_ DIVIDE(\"实时分账\"), SPLIT_ACCOUNT_IN( \"实时拆分入账\")时，必填");
        }
    }
}
