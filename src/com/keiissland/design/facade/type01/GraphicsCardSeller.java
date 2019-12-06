package com.keiissland.design.facade.type01;

/**
 * 显卡卖家：充当门面模式中的SubSystem（子系统）角色
 * 提供售卖显卡服务
 */
public class GraphicsCardSeller {

    /**
     * 获取显卡
     * @return 一块 RTX 2080Ti 的显卡
     */
    public String getGraphicsCard() {
        return "RTX 2080Ti";
    }
}
