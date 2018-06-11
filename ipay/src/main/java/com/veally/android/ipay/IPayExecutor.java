package com.veally.android.ipay;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author <veally>
 */
public interface IPayExecutor extends IProvider{
    void pay();
}
