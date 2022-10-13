package com.zoeyun.tgsdk.pay.bean.request.pay;

import com.zoeyun.tgsdk.annotation.Required;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.bean.BaseRequest;
import com.zoeyun.tgsdk.pay.config.PayConfig;
import lombok.*;
import org.apache.commons.lang3.StringUtils;


@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class AllQrcodePayRequest extends BaseRequest {

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
    String notifyUrl;

    /**
     * 支付完成前端返回地址
     */
    String returnUrl;

    /**
     * 附加字段
     */
    String attach;

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
     * 易宝使用实时分账回告商户地址资金处理类型为：REAL_TIME_DIVIDE("实时分账")时，必填，
     * 分账回调需要等渠道分账成功之后才会回调，一般在实时分账后半小时左右
     */
    String divideNotify;

    /**
     * 乐刷和微信渠道使用，Y表示分账订单，其他表示订单不分账
     */
    String profitSharing;

    /**
     * 订单失效时间，格式为 yyyy-MM-dd HH:mm:ss，实效会提示， 二维码已失效
     */
    String orderTimeOut;

    /**
     * 支付宝场景数据
     */
    String industryInfo;

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
