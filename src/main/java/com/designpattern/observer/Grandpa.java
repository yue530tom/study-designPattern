package com.designpattern.observer;

public class Grandpa implements Senior {

	@Override
	public void update(String action) {
		// TODO Auto-generated method stub
		System.err.println("grandpa receive :"+action);
	}

}
