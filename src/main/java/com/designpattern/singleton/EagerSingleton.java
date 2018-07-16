package com.designpattern.singleton;

public class EagerSingleton {
	private static EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {
	}

	public static synchronized EagerSingleton getInstance() {
		
		return eagerSingleton;
	}
}
