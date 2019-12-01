package com.keiissland.design.decorator.type01;

/**
 * 镜头抽象类
 */
public abstract class Lens implements Photographable {

    /**
     * 持有被装饰类引用
     */
    public Photographable photographable;

    public Lens(Photographable photographable) {
        this.photographable = photographable;
    }
}
