package com.designpattern.abstractfactory;

public class FactoryCan implements FactoryIntf {

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return new Can();
	}
	@Override
	public Package getPackage() {
		// TODO Auto-generated method stub
		return new MidPackage();
	}
}
