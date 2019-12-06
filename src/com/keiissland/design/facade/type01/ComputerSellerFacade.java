package com.keiissland.design.facade.type01;

/**
 * 电脑卖家：充当门面模式中的Facade（门面）角色
 * 负责向各个配件卖家（子系统）购买电脑配件
 */
public class ComputerSellerFacade {

    /**
     * 聚合各个子系统
     */
    private MemorySeller memorySeller;

    private GraphicsCardSeller graphicsCardSeller;

    private HardDiskSeller hardDiskSeller;

    public ComputerSellerFacade(MemorySeller memorySeller, GraphicsCardSeller graphicsCardSeller, HardDiskSeller hardDiskSeller) {
        this.memorySeller = memorySeller;
        this.graphicsCardSeller = graphicsCardSeller;
        this.hardDiskSeller = hardDiskSeller;
    }

    public Computer getComputer() {
        return assembleComputer();
    }

    /**
     * 通过各个子系统，购买并组装配件
     * @return 电脑
     */
    private Computer assembleComputer() {
        String memory = memorySeller.getMemory();
        String graphicsCard = graphicsCardSeller.getGraphicsCard();
        String hardDisk = hardDiskSeller.getHardDisk();
        return new Computer(memory, hardDisk, graphicsCard);
    }
}
