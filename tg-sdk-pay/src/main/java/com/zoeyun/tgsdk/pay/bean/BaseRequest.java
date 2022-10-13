package com.zoeyun.tgsdk.pay.bean;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.zoeyun.tgsdk.annotation.Required;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.config.PayConfig;
import com.zoeyun.tgsdk.utils.BeanUtils;
import com.zoeyun.tgsdk.utils.SignUtils;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


@Data
@Accessors(chain = true)
public abstract class BaseRequest implements Serializable {

    private static final long serialVersionUID = -9008781692262014495L;


    /**
     * 聚合支付账号
     */
    @Required
    String account;

    /**
     * 签名
     */
    String sign;


    /**
     * 签名时，忽略的参数.
     *
     * @return the string [ ]
     */
    protected String[] getIgnoredParamsForSign() {
        return new String[0];
    }


    /**
     * 检查请求参数内容，包括必填参数以及特殊约束.
     */
    private void checkFields() throws ErrorException {
        //check required fields
        try {
            BeanUtils.checkRequiredFields(this);
        } catch (ErrorException e) {
            throw new ErrorException(e.getMessage());
        }

        //check other parameters
        this.checkConstraints();
    }

    protected abstract void checkConstraints() throws ErrorException;


    /**
     * <pre>
     * 检查参数，并设置签名.
     * 1、检查参数（注意：子类实现需要检查参数的而外功能时，请在调用父类的方法前进行相应判断）
     * 2、补充系统参数，如果未传入则从配置里读取
     * 3、生成签名，并设置进去
     * </pre>
     *
     * @param payConfig 支付配置对象，用于读取相应系统配置信息
     * @throws ErrorException the  pay exception
     */
    public void checkAndSign(PayConfig payConfig) throws ErrorException {
        if (StringUtils.isBlank(account)) {
            this.account = payConfig.getMchId();
        }
        this.checkFields();
        JSONObject signParams = (JSONObject) JSON.toJSON(this);
        sign = SignUtils.getSign(signParams, payConfig.getMchKey());
    }

    public String toJSONString() {
        JSONObject params = (JSONObject) JSON.toJSON(this);
        return params.toJSONString(JSONWriter.Feature.WriteMapNullValue);
    }


}
