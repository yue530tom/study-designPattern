package com.designpattern.abstractfactory;

public class Cup implements Container {

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.err.println("Cup name:Cup");
	}

	@Override
	public void getShap() {
		// TODO Auto-generated method stub
		System.err.println("Cup shap:cylinder");
	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.err.println("Cup Color:white");
	}

}
