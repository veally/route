package com.veally.android.alipay;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.veally.android.ipay.IPayExecutor;
import com.veally.android.ipay.PayRouteDefine;

/**
 * @author <veally>
 */
@Route(path = PayRouteDefine.ALIPAY)
public class AlipayExecutor implements IPayExecutor {
    @Override
    public void pay() {
        Log.i("routepay", ">>> AlipayExecutor is paying ......");
    }

    @Override
    public void init(Context context) {
        Log.i("pay", "初始化支付容器");
    }
}
