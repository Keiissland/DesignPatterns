package com.keiissland.design.adapter.type01;

public class Client {

    public static void main(String[] args) {

        // 1. 提供标准电源，只能输出220V电压
        PowerSupply powerSupply = new PowerSupply();
        System.out.println(String.format("适配前的电源电压为：%sV", powerSupply.output220Voltage()));


        // 2. 将标准电源交由适配器进行适配，得出15V的电压
        PowerSupply15V powerSupply15V = new Adapter(powerSupply);
        System.out.println(String.format("适配后的电源电压为：%sV", powerSupply15V.output15Voltage()));
    }
}
