package com.designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSafety extends ComponentSafety {
    private List<ComponentSafety> children = new ArrayList<>();

    public CompositeSafety(String name){
        setName(name);
    }
    protected void add(ComponentSafety c) {
        children.add(c);
    }

    protected void remove(ComponentSafety c) {
        children.remove(c);
    }

    @Override
    protected void display(int depth) {
        String temp = "";
        for (int i=0; i<depth; i++){
            temp += "-";
        }
        System.out.println(temp + getName());

        for (ComponentSafety child : children){
            child.display(depth + 2);
        }
    }
}