package com.veally.android.ipay;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author <veally>
 */
@IntDef({IPayType.CASHPAY, IPayType.ALIPAY})
@Retention(value = RetentionPolicy.SOURCE)
public @interface IPayType {
    public final int CASHPAY = 0x1;
    public final int ALIPAY = 0X2;

}
