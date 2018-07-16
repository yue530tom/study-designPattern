package com.designpattern.singleton;

public class SingletonSyncNew {

	private static SingletonSyncNew instance = null;

	private SingletonSyncNew() {

	}

	public static SingletonSyncNew getSingleton() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingletonSyncNew();
				}
			}
		}
		return instance;
	}
}
