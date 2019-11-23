package com.keiissland.design.builder.type01;

public class SmallRoomBuilder implements Builder {

    private Room room = new Room();

    @Override
    public void buildLength() {
        room.setLength("SmallLength");
    }

    @Override
    public void buildWidth() {
        room.setWidth("SmallWidth");
    }

    @Override
    public void buildHeight() {
        room.setHeight("SmallHeight");
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
