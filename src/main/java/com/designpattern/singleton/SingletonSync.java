package com.designpattern.singleton;

public class SingletonSync {

	private static SingletonSync instance = null;
	
	private SingletonSync(){
		
	}
	
	public static SingletonSync getSingleton() {
		if (instance==null) {
			instance=new SingletonSync();
		}
		return instance;
	}
}
