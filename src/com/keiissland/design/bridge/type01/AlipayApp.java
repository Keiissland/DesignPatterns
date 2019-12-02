package com.keiissland.design.bridge.type01;

public class AlipayApp implements AppImplementor {

    @Override
    public String getAppName() {
        return "支付宝";
    }
}
