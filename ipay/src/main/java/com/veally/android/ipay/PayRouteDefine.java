package com.veally.android.ipay;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author <veally>
 */
@StringDef({PayRouteDefine.CASHPAY, PayRouteDefine.ALIPAY})
@Retention(value = RetentionPolicy.SOURCE)
public @interface PayRouteDefine {
    public final String CASHPAY = "/cashpay/executor";
    public final String ALIPAY = "/alipay/executor";

}
