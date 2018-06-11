package com.veally.android.paybridge;

import com.veally.android.ipay.IPayExecutor;
import com.veally.android.ipay.IPayType;
import com.veally.android.paybridge.dispatcher.IPayDispatcher;
import com.veally.android.paybridge.dispatcher.PayDispatcher;

/**
 * @author <veally>
 */
public class PayBridge {
    IPayExecutor mPayExecutor;
    @IPayType int mPayType;

    IPayDispatcher mPayDispatcher;

    PayBridge(Builder builder) {
        mPayType = builder.mPayType;
        mPayDispatcher =new PayDispatcher();
    }

    public void pay(){
        mPayDispatcher.pay(mPayType);
    }


    public static class Builder {
        @IPayType int mPayType;

        public Builder() {
        }

        public Builder setPayType(@IPayType int payType) {
            mPayType = payType;
            return this;
        }

        public PayBridge build() {
            return new PayBridge(this);
        }
    }
}
