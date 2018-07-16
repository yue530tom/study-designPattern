package com.designpattern.abstractfactory;

public class Bottle implements Container {

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.err.println("bottle name:bottle");
	}

	@Override
	public void getShap() {
		// TODO Auto-generated method stub
		System.err.println("bottle shap:cylinder");
	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.err.println("bottle Color:black");
	}

}
