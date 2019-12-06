package com.keiissland.design.facade.type01;

/**
 * 电脑，商家组装后的成品
 */
public class Computer {

    /**
     * 电脑的相关配件
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String hardDisk;

    /**
     * 显卡
     */
    private String graphicsCard;

    public Computer(String memory, String hardDisk, String graphicsCard) {
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
