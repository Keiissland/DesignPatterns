package com.keiissland.design.decorator.type01;

/**
 * 装饰者：定焦镜头
 * 可以帮助拍照设备增加1000W像素
 */
public class FixedFocusLens implements Photographable {

    /**
     * 定焦镜头自带1000W像素
     */
    private final int pixel = 1000;

    private Photographable photographable;

    public FixedFocusLens(Photographable photographable) {
        this.photographable = photographable;
    }

    /**
     * 有了定焦镜头加持后的拍照设备的最终像素值
     * @return 最终像素值
     */
    @Override
    public int getPixel() {
        return this.pixel + photographable.getPixel();
    }
}
