package com.designpattern.observer;

public class Grandma implements Senior {

	@Override
	public void update(String action) {
		// TODO Auto-generated method stub
		System.err.println("grandma receive :"+action);
	}

}
