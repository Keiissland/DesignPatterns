#### 组合模式 ####

**描述**
- 通过组合模式来模拟页面上，导航栏 --> 菜单 --> 具体页面的层级关系
- PageComponent 是页面中组件的抽象（导航栏、菜单、具体页面）
- NavigationBar 导航栏
- LevelOneMenu  一级菜单，导航栏的下一级
- LevelTwoMenu  二级菜单，一级菜单的下一级
- Page 具体页面即叶子节点，没有子节点