package com.designpattern.singleton;

public class DoubleCheckSingleton {
	private static DoubleCheckSingleton doubleCheckSingleton;

	private DoubleCheckSingleton() {
	}

	public static synchronized DoubleCheckSingleton getInstance() {
		if (doubleCheckSingleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (doubleCheckSingleton == null) {
					doubleCheckSingleton = new DoubleCheckSingleton();
				}
			}
		}
		return doubleCheckSingleton;
	}

}
