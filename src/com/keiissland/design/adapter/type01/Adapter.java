package com.keiissland.design.adapter.type01;

public class Adapter implements PowerSupply15V {

    private PowerSupply powerSupply;

    public Adapter(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public int output15Voltage() {
        
        // 获取标准电压输出的220V点
        int originalVoltage = powerSupply.output220Voltage();

        // 对原始电压进行减压，得到适配后的15V电压
        return originalVoltage / 14;
    }
}
