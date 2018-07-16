package com.designpattern.observer;

public class Xiaoming  extends Children{
    private String action;
    
    public String getState() {
        return action;
    }

    public void change(String action){
        this.action = action;
        System.out.println("Xiaoming change: " + action);
        this.nodifySeniors(action);
    }
}
