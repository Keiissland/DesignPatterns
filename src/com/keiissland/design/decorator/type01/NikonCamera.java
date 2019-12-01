package com.keiissland.design.decorator.type01;

/**
 * 尼康相机
 */
public class NikonCamera implements Photographable {

    /**
     * 尼康相机原生像素值为
     * @return 尼康相机像素值
     */
    @Override
    public int getPixel() {
        return 1400;
    }
}
