package com.designpattern.observer;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		Xiaoming xiaoming = new Xiaoming();

		Grandpa grandpa = new Grandpa();
		Grandma grandma = new Grandma();

		xiaoming.add(grandpa);
		xiaoming.add(grandma);

		Thread.sleep(1000);
		xiaoming.change("cry");
		
		Thread.sleep(1000);
		xiaoming.remove(grandma);
		
		xiaoming.change("haha");
	}
}
