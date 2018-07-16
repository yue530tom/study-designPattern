package com.designpattern.Composite;

public abstract class ComponentSafety {
	
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void display(int depth);
}