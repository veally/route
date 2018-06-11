package com.veally.android.cashpay;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.veally.android.ipay.IPayExecutor;
import com.veally.android.ipay.PayRouteDefine;

/**
 * @author <veally>
 */
@Route(path = PayRouteDefine.CASHPAY)
public class CashPayExecutor implements IPayExecutor {
    @Override
    public void pay() {
        Log.i("routepay", ">>>  CashPayExecutor is paying  ......");
    }

    @Override
    public void init(Context context) {

    }
}
