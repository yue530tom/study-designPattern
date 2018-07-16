package com.designpattern.abstractfactory;

public class Can implements Container {

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.err.println("can name:can");
	}

	@Override
	public void getShap() {
		// TODO Auto-generated method stub
		System.err.println("can shap:cycle");
	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.err.println("can color:green");
	}

}
