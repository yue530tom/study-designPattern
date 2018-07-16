package com.designpattern.state;

public class TestMain {
	public static void main(String[] args) {  
        
        State state = new ConcreteState();  
        Context context = new Context(state);  
        context.method();  
        
        state = new ConcreteStateCopy();  
        context = new Context(state);  
        context.method();  
    }  
}
