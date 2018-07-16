package com.designpattern.singleton;

public class StaticInnerSingleton {
	private StaticInnerSingleton() {
	}

	public static synchronized StaticInnerSingleton getInstance() {
		return StaticInnerSingletonHolder.staticInnerSingleton;
	}

	private static class StaticInnerSingletonHolder {
		private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
	}
}
