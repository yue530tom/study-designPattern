package com.designpattern.factory;

public class StaticFactory {

	public static Container getCup() {
		return new Cup();
	}

	public static Container getBottle() {
		return new Bottle();
	}

	public static Container getCan() {
		return new Can();
	}
}
