package com.designpattern.Composite;

public abstract class ComponentLucency {
	
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void add(ComponentLucency c);

    protected abstract void remove(ComponentLucency c);

    protected abstract void display(int depth);
}