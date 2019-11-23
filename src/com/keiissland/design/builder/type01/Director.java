package com.keiissland.design.builder.type01;

/**
 * 引入指挥者的目的：指定构造流程、方式
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Room buildRoom() {
        builder.buildLength();
        builder.buildWidth();
        builder.buildHeight();
        return builder.getRoom();
    }
}
