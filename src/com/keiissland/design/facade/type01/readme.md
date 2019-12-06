#### 门面模式 ####

**描述**
- 背景：开学期间，小明准备买台台式机，他了解到台式机可以自己购买零件组装，也可以委托商家帮忙组装，考虑到自己是电脑小白最终小明选择委托商家帮忙购买零件和组装电脑
- MemorySeller：内存条卖家，提供售卖内存条的途径，充当门面模式中的SubSystem子系统角色
- GraphicsCardSeller：显卡卖家，提供售卖显卡服务，充当门面模式中的SubSystem子系统角色
- HardDiskSeller：硬盘卖家，提供售卖硬盘服务，充当门面模式中的SubSystem子系统角色
- ComputerSellerFacade：电脑卖家，充当门面模式中的Facade角色，负责向各个配件卖家（子系统）购买电脑配件
- Computer：商家组装好的电脑