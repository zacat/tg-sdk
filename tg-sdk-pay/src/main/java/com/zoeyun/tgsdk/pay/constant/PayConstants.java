package com.zoeyun.tgsdk.pay.constant;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.Format;

public class PayConstants {

    /**
     * 据接口的参数中日期格式.
     */
    public static final Format DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");


    /**
     * 业务结果代码.
     */
    public static class ResultCode {
        /**
         * 成功.
         */
        public static final Integer SUCCESS = 100;
    }
}
