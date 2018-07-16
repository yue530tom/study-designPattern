package com.designpattern.decorator;

public class TestMain {
	public static void main(String[] args) {
		Service waiter = new NewWaiter();
		Service waitress = new SkilledWaiter(waiter);
		waitress.service();
	}
}
