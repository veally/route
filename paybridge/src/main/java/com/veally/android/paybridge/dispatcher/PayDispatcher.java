package com.veally.android.paybridge.dispatcher;

import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.veally.android.ipay.IPayExecutor;
import com.veally.android.ipay.IPayType;
import com.veally.android.ipay.PayRouteDefine;

/**
 * @author <veally>
 */
public class PayDispatcher implements IPayDispatcher {
    IPayExecutor mPayExcuter;
    @Override
    public void pay(@IPayType int payType) {
        //分派支付任务执行器
//        Log.i("routepay", " >>>>>>>>> dispatch pay <<<<<<<<<");
        switch (payType) {
            case IPayType.CASHPAY:
                mPayExcuter = (IPayExecutor) ARouter.getInstance().build(PayRouteDefine.CASHPAY).navigation();
                break;
            case IPayType.ALIPAY:
                mPayExcuter = (IPayExecutor) ARouter.getInstance().build(PayRouteDefine.ALIPAY).navigation();
                break;
        }
        if(mPayExcuter == null){
            //pay failure
            Log.w("route","------- 没有找到支付服务 -------");
            return;
        }
        mPayExcuter.pay();
    }
}
