package com.designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeLucency extends ComponentLucency {
    private List<ComponentLucency> children = new ArrayList<>();

    public CompositeLucency(String name){
        setName(name);
    }

    @Override
    protected void add(ComponentLucency c) {
        children.add(c);
    }

    @Override
    protected void remove(ComponentLucency c) {
        children.remove(c);
    }

    @Override
    protected void display(int depth) {
        String temp = "";
        for (int i=0; i<depth; i++){
            temp += "-";
        }
        System.out.println(temp + getName());

        for (ComponentLucency child : children){
            child.display(depth + 2);
        }
    }
}