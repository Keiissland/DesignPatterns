package com.keiissland.design.bridge.type01;

public class AndroidApp extends AbstractApp {

    public AndroidApp(AppImplementor appImplementor) {
        super(appImplementor);
    }

    @Override
    public String getOsVersion() {
        return "安卓";
    }
}
