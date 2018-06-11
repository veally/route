package com.veally.android.route;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.veally.android.ipay.IPayType;
import com.veally.android.paybridge.PayBridge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cashpay(View v){
        new PayBridge.Builder().setPayType(IPayType.CASHPAY).build().pay();
    }

    public void alipay(View view) {
        new PayBridge.Builder().setPayType(IPayType.ALIPAY).build().pay();
    }
}
