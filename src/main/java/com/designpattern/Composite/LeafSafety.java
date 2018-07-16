package com.designpattern.Composite;

public class LeafSafety extends ComponentSafety {

    public LeafSafety(String name){
        setName(name);
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
