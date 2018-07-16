package com.designpattern.singleton;

public class SingletonPerfactor {

	
	private SingletonPerfactor(){
		
	}
	
	private static class SingletonFactory {  
        private static SingletonPerfactor instance = new SingletonPerfactor();  
    }  
	public static SingletonPerfactor getInstance() {  
        return SingletonFactory.instance;  
    }  
}
