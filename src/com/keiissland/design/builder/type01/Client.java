package com.keiissland.design.builder.type01;

public class Client {

    public static void main(String[] args) {

        // 指定构造者，交由指挥者构建大房子
        Room largeRoom = new Director(new LargeRoomBuilder()).buildRoom();
        System.out.println(largeRoom);

        // 指定构造者，交由指挥者构建小房子
        Room smallRoom = new Director(new SmallRoomBuilder()).buildRoom();
        System.out.println(smallRoom);
    }
}
