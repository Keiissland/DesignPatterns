package com.keiissland.design.composite.type01;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色：Composite
 * 导航栏，子节点为一级菜单栏
 */
public class NavigationBar extends PageComponent {

    private List<PageComponent> components = new ArrayList<>();

    public NavigationBar(String name) {
        super(name);
    }

    @Override
    public void add(PageComponent component) {
        components.add(component);
    }

    @Override
    public void remove(PageComponent component) {
        components.remove(component);
    }

    @Override
    public void print(int level) {
        StringBuilder prefix = new StringBuilder("|");
        for (int i = 0; i < level; i++) {
            prefix.append("--");
        }

        System.out.println(String.format("%s%s", prefix, this.name));
        for (PageComponent component : components) {
            component.print(level + 1);
        }
    }
}
