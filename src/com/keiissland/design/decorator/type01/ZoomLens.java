package com.keiissland.design.decorator.type01;

/**
 * 装饰者：变焦镜头
 * 可以帮助拍照设备增加800W像素
 */
public class ZoomLens extends Lens {

    /**
     * 变焦镜头自带800W像素
     */
    private final int pixel = 800;

    public ZoomLens(Photographable photographable) {
        super(photographable);
    }

    /**
     * 有了变焦镜头加持后的拍照设备的最终像素值
     * @return 最终像素值
     */
    @Override
    public int getPixel() {
        return photographable.getPixel() + this.pixel;
    }
}
