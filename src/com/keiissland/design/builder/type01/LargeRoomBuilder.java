package com.keiissland.design.builder.type01;

public class LargeRoomBuilder implements Builder {

    private Room room = new Room();

    @Override
    public void buildLength() {
        room.setLength("LargeLength");
    }

    @Override
    public void buildWidth() {
        room.setWidth("LargeWidth");
    }

    @Override
    public void buildHeight() {
        room.setHeight("LargeHeight");
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
