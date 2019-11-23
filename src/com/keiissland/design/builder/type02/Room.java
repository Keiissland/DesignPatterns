package com.keiissland.design.builder.type02;

public class Room {

    private String length;

    private String width;

    private String height;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Room room = new Room();

        public Builder buildLength(String length) {
            room.setLength(length);
            return this;
        }

        public Builder buildWidth(String width) {
            room.setWidth(width);
            return this;
        }

        public Builder builderHeight(String height) {
            room.setHeight(height);
            return this;
        }

        public Room build() {
            return room;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
