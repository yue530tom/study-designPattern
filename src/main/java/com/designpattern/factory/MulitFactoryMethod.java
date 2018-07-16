package com.designpattern.factory;

public class MulitFactoryMethod {

	public Container getCup() {
		return new Cup();
	}

	public Container getBottle() {
		return new Bottle();
	}

	public Container getCan() {
		return new Can();
	}
}
