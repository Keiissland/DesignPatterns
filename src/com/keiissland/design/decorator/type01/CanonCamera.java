package com.keiissland.design.decorator.type01;

/**
 * 佳能相机
 */
public class CanonCamera implements Photographable {

    /**
     * 佳能相机原生像素值为
     * @return 佳能相机像素值
     */
    @Override
    public int getPixel() {
        return 1200;
    }
}
