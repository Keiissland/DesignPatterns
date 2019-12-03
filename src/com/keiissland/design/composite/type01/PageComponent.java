package com.keiissland.design.composite.type01;

/**
 * 角色：Component
 * 对WEB页面中组件的抽象
 * 实现类可以是导航栏、各级菜单、页面
 */
public abstract class PageComponent {

    public String name;

    public abstract void add(PageComponent component);

    public abstract void remove(PageComponent component);

    /**
     * 打印当前页面组件名称
     * @param level 组建所在层级，导航栏为第0级
     */
    public abstract void print(int level);

    public PageComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
