package com.designpattern.Composite;

public class LeafLucency extends ComponentLucency {

    public LeafLucency(String name){
        setName(name);
    }

    @Override
    protected void add(ComponentLucency c) {
        //Ҷ�ӽڵ㲻������ӽڵ�,��˲���ʵ��
    }

    @Override
    protected void remove(ComponentLucency c) {
        //Ҷ�ӽڵ㲻������ӽڵ�,��˲���ʵ��
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
