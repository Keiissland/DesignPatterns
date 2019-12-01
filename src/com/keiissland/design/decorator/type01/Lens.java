package com.keiissland.design.decorator.type01;

public abstract class Lens implements Photographable {

    public Photographable photographable;

    public Lens(Photographable photographable) {
        this.photographable = photographable;
    }
}
