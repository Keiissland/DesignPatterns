package com.keiissland.design.bridge.type01;

public abstract class AbstractApp {

    /**
     * 将App具体实现，聚合进来
     */
    public AppImplementor appImplementor;

    public AbstractApp(AppImplementor appImplementor) {
        this.appImplementor = appImplementor;
    }

    public void showOsVersion() {
        System.out.println(String.format("版本：%s，名称：%s", getOsVersion(), appImplementor.getAppName()));
    }

    public abstract String getOsVersion();
}
