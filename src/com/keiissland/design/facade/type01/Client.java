package com.keiissland.design.facade.type01;

/**
 * 客户端
 * 小明，从电脑卖家ComputerSellerFacade手中获得电脑
 */
public class Client {

    public static void main(String[] args) {

        ComputerSellerFacade seller = new ComputerSellerFacade(new MemorySeller(),
                new GraphicsCardSeller(), new HardDiskSeller());

        // 只需要通过电脑卖家，便可直接获得电脑，而不需要自己去电脑配件商家中逐个购买
        Computer computer = seller.getComputer();

        // 查看购买到的电脑配置信息
        System.out.println(computer);
    }
}
