#### 装饰者模式 ####

**描述**
- 被装饰者为相机类：佳能相机（CanonCamera）、尼康相机（NikonCamera）
- 装饰者为镜头类：变焦镜头（ZoomLens）、定焦镜头（FixedFocusLens）
- 相机在镜头的加持下（即装饰下），可以提高自己的像素。一个相机可以被多个镜头装饰，像素大小会进行叠加
- CanonCamera 原生像素为1200W，NikonCamera 原生像素为800W
- ZoomLens 可增加800W像素，FixedFocusLens 可增加1000W像素