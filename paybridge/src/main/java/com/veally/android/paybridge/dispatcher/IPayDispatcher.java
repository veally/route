package com.veally.android.paybridge.dispatcher;

import com.veally.android.ipay.IPayType;

/**
 * @author <veally>
 */
public interface IPayDispatcher {
    void pay(@IPayType int payType);
}
