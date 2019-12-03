package com.keiissland.design.composite.type01;

public class Client {

    public static void main(String[] args) {

        // 模仿京东导航结构，具体结构如下
        // |京东时尚分类
        // |--男装
        // |----当季特卖
        // |------T恤展示页面
        // |------夹克展示页面
        // |--女装
        // |----当季新品
        // |------呢子衣展示页面
        // |------连衣裙展示页面
        Page page11 = new Page("T恤展示页面");
        Page page12 = new Page("夹克展示页面");

        Page page21 = new Page("呢子衣展示页面");
        Page page22 = new Page("连衣裙展示页面");

        LevelTwoMenu levelTwoMenu1 = new LevelTwoMenu("当季特卖");
        levelTwoMenu1.add(page11);
        levelTwoMenu1.add(page12);

        LevelTwoMenu levelTwoMenu2 = new LevelTwoMenu("当季新品");
        levelTwoMenu2.add(page21);
        levelTwoMenu2.add(page22);

        LevelOneMenu levelOneMenu1 = new LevelOneMenu("男装");
        levelOneMenu1.add(levelTwoMenu1);

        LevelOneMenu levelOneMenu2 = new LevelOneMenu("女装");
        levelOneMenu2.add(levelTwoMenu2);

        NavigationBar navigationBar = new NavigationBar("京东时尚分类");
        navigationBar.add(levelOneMenu1);
        navigationBar.add(levelOneMenu2);

        // 导航栏层级为0
        navigationBar.print(0);
    }
}
