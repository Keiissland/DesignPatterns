package com.keiissland.design.facade.type01;

/**
 * 内存条卖家：充当外观模式中的SubSystem（子系统）角色
 * 提供售卖内存条服务
 */
public class MemorySeller {

    /**
     * 获取内存条
     * @return 一根 Kingston 32GB 内存条
     */
    public String getMemory() {
        return "Kingston 32GB";
    }
}
