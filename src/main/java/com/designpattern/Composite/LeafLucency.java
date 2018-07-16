package com.designpattern.Composite;

public class LeafLucency extends ComponentLucency {

    public LeafLucency(String name){
        setName(name);
    }

    @Override
    protected void add(ComponentLucency c) {
        //叶子节点不能添加子节点,因此不做实现
    }

    @Override
    protected void remove(ComponentLucency c) {
        //叶子节点不能添加子节点,因此不做实现
    }

    @Override
    protected void display(int depth) {
        String temp = "";
        for (int i=0; i<depth; i++){
            temp += "-";
        }
        System.out.println(temp + getName());
    }
}
