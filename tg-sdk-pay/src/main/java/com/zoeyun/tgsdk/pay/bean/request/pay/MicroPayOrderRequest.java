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
public class MicroPayOrderRequest extends BaseRequest {

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
     * 消费者付款码信息
     */
    @Required
    String barcode;

    /**
     * 商品
     */
    @Required
    String body;

    /**
     * 客户自定义的收银员编号
     */
    String lowCashier;


    /**
     * 附加字段
     */
    String attach;

    /**
     * 场景值 bar_code:扫码支付 security_code:刷脸支付
     */
    String scene;

    /**
     * 值为"Y"时，接口返回优惠信息字段
     */
    String extendInfo;

    /**
     * 支付方式 0：微信，1：支付宝，2：银联扫 码 6：龙支付 8 ：翼支付，H：数字货币 （若不传该参数，则呈现根据付款码自动判断付款方式）
     */
    String payType;


    /**
     * 设备参数(当刷脸支付时必传)
     */
    String terminalParams;

    /**
     * 单品优惠活动该字段必传，且必须按照规范上传，JSON格式，详见附录3.2
     */
    String detail;


    /**
     * 门店号
     */
    String storeId;

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
    String divideNotifyUrl;

    /**
     * 乐刷和微信渠道使用，Y表示分账订单，其他表示订单不分账
     */
    String profitSharing;


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

        if (StringUtils.isNotEmpty(scene) && scene.equalsIgnoreCase("security_code")) {
            throw new ErrorException("刷脸支付时设备参数，必填");
        }
    }
}
