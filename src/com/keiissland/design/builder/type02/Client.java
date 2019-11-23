package com.keiissland.design.builder.type02;

public class Client {

    public static void main(String[] args) {

        // 更具用户需求，灵活设值
        Room largeRoom = Room.builder().buildLength("LargeLength")
                .buildWidth("LargeWidth")
                .builderHeight("HeightWidth")
                .build();
        System.out.println(largeRoom);

        Room smallRoom = Room.builder().buildLength("smallLength")
                .buildWidth("smallWidth")
                .builderHeight("smallWidth")
                .build();
        System.out.println(smallRoom);
    }
}
