package com.zoeyun.tgsdk.pay.bean;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.annotation.JSONField;
import com.zoeyun.tgsdk.exception.ErrorException;
import com.zoeyun.tgsdk.pay.constant.PayConstants;
import com.zoeyun.tgsdk.pay.service.PayService;
import com.zoeyun.tgsdk.pay.service.TgService;
import com.zoeyun.tgsdk.utils.SignUtils;
import lombok.Data;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public abstract class BaseResult implements Serializable {
    private static final long serialVersionUID = -6225846145558386781L;

    Integer status;
    String message;
    String sign;

    @JSONField(serialize = false, deserialize = false)
    String responseContent;

    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

    /**
     * 校验返回结果.
     *
     * @throws ErrorException the  pay exception
     */
    public void checkResult(TgService tgService, boolean checkSuccess) throws ErrorException {
        JSONObject signParams = (JSONObject) JSON.toJSON(this);
        if (getSign() != null && !SignUtils.checkSign(signParams, tgService.getConfig().getMchKey())) {
            this.getLogger().debug("校验结果签名失败，参数：{}", signParams);
            throw new ErrorException("参数格式校验错误！");
        }
        if (checkSuccess) {
            if (this.status != PayConstants.ResultCode.SUCCESS) {
                StringBuilder errorMsg = new StringBuilder();
                if (getStatus() != null) {
                    errorMsg.append("返回代码：").append(getStatus());
                }
                if (getMessage() != null) {
                    errorMsg.append("，返回信息：").append(getMessage());
                }
                this.getLogger().error("\n结果业务代码异常，返回结果：{},\n{}", responseContent, errorMsg.toString());
                throw new ErrorException(errorMsg.toString());
            }
        }
    }

    public static <T extends BaseResult> T fromJSON(String responseContent, Class<T> clz) {
        T t = JSON.parseObject(responseContent, clz);
        t.responseContent = responseContent;
        return t;
    }
}
