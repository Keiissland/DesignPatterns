package com.keiissland.design.composite.type01;

/**
 * 角色：Leaf
 * 具体的页面类，没有子节点
 */
public class Page extends PageComponent {

    public Page(String name) {
        super(name);
    }

    @Override
    public void add(PageComponent component) {
        // 子节点没有孩子节点，此处为空实现，可以保持对外同种一致性的访问方式
    }

    @Override
    public void remove(PageComponent component) {
        // 子节点没有孩子节点，此处为空实现，可以保持对外同种一致性的访问方式
    }

    @Override
    public void print(int level) {
        StringBuilder prefix = new StringBuilder("|");
        for (int i = 0; i < level; i++) {
            prefix.append("--");
        }

        System.out.println(String.format("%s%s", prefix, this.name));
    }
}
