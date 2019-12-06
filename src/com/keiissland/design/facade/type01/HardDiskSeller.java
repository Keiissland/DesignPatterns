package com.keiissland.design.facade.type01;

/**
 * 硬盘卖家：充当门面模式中的SubSystem（子系统）角色
 * 提供售卖硬盘服务
 */
public class HardDiskSeller {

    /**
     * 获取硬盘
     * @return 一块西部数据1T硬盘
     */
    public String getHardDisk() {
        return "WD 1T";
    }
}
