package com.keiissland.design.bridge.type01;

public class WeChatApp implements AppImplementor {

    @Override
    public String getAppName() {
        return "微信";
    }
}
