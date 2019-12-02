package com.keiissland.design.bridge.type01;

public class Client {

    public static void main(String[] args) {

        // 1. 创建出App的具体实例（weChatApp、alipayApp）
        AppImplementor weChatApp = new WeChatApp();
        AppImplementor alipayApp = new AlipayApp();

        // 2. 将具体的App分别与不同的操作系统进行组合，得到不同的版本的App
        AbstractApp androidWeChat = new AndroidApp(weChatApp);
        androidWeChat.showOsVersion();

        AbstractApp androidAlipay = new AndroidApp(alipayApp);
        androidAlipay.showOsVersion();

        AbstractApp iosWeChat = new IosApp(weChatApp);
        iosWeChat.showOsVersion();

        AbstractApp iosAlipay = new IosApp(alipayApp);
        iosAlipay.showOsVersion();
    }
}
