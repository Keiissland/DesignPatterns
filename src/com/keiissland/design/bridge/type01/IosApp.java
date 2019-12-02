package com.keiissland.design.bridge.type01;

public class IosApp extends AbstractApp {

    public IosApp(AppImplementor appImplementor) {
        super(appImplementor);
    }

    @Override
    public String getOsVersion() {
        return "IOS";
    }
}
