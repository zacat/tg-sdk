package com.zoeyun.tgsdk.pay.bean.result.pay;

import com.zoeyun.tgsdk.pay.bean.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class QueryRefundOrderListResult extends BaseResult {

    @Data
    @NoArgsConstructor
    static class QueryRefundOrder implements Serializable {

        private static final long serialVersionUID = 3295810716784832486L;

        /**
         * 退款状态 "0":退款成功 "1":退款失败 "2": 退款中
         */
        String refundState;

        /**
         * 退款金额
         */
        String refundMoney;

        /**
         * 下游退款单号
         */
        String lowRefundNo;

        /**
         * 退款时间
         */
        String refundTime;
    }

    List<QueryRefundOrder> refundOrderList;
}
