package com.keiissland.design.adapter.type02;

public class Adapter extends PowerSupply implements PowerSupply15V {

    @Override
    public int output15Voltage() {
        
        // 通过继承获取标准电压输出的220V点
        int originalVoltage = super.output220Voltage();

        // 对原始电压进行减压，得到适配后的15V电压
        return originalVoltage / 14;
    }
}
