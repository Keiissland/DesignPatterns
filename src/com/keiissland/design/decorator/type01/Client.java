package com.keiissland.design.decorator.type01;

public class Client {

    public static void main(String[] args) {

        // 1.1 创建一台佳能相机
        Photographable canonCamera = new CanonCamera();
        // 1.2 输出佳能相机初始像素值
        System.out.println(String.format("佳能相机初始像素大小为：%s", canonCamera.getPixel()));

        // 1.3 给佳能相机一个变焦镜头进行加持
        Photographable canonCameraWithZoomLens = new ZoomLens(canonCamera);
        // 1.4 输出有了变焦镜头加持后的佳能相机的像素值
        System.out.println(String.format("变焦镜头加持后的佳能相机像素大小为：%s", canonCameraWithZoomLens.getPixel()));

        // 1.5 在佳能相机有一个变焦镜头进行加持的基础上，在给上一个定焦镜头的加持
        Photographable canonCameraWithZoomLensAndFixedFocusLens = new FixedFocusLens(canonCameraWithZoomLens);
        // 1.6 在佳能相机有一个变焦镜头进行加持的基础上，在给上一个定焦镜头进行叠加
        System.out.println(String.format("变焦镜头和定焦镜头加持后的佳能相机像素大小为：%s", canonCameraWithZoomLensAndFixedFocusLens.getPixel()));

        // 分割
        System.out.println("=========================");

        // 2.1 创建一台佳能相机
        Photographable nikonCamera = new NikonCamera();
        // 2.2 输出佳能相机初始像素值
        System.out.println(String.format("尼康相机初始像素大小为：%s", nikonCamera.getPixel()));

        // 2.3 给佳能相机一个变焦镜头进行加持
        Photographable nikonCameraWithZoomLens = new ZoomLens(nikonCamera);
        // 2.4 输出有了变焦镜头加持后的佳能相机的像素值
        System.out.println(String.format("变焦镜头加持后的尼康相机像素大小为：%s", nikonCameraWithZoomLens.getPixel()));

        // 2.5 在佳能相机有一个变焦镜头进行加持的基础上，在给上一个定焦镜头的加持
        Photographable nikonCameraWithZoomLensAndFixedFocusLens = new FixedFocusLens(nikonCameraWithZoomLens);
        // 2.6 在佳能相机有一个变焦镜头进行加持的基础上，在给上一个定焦镜头进行叠加
        System.out.println(String.format("变焦镜头和定焦镜头加持后的尼康相机像素大小为：%s", nikonCameraWithZoomLensAndFixedFocusLens.getPixel()));
    }
}
