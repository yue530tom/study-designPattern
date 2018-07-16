package com.designpattern.abstractfactory;

public class FactoryCup implements FactoryIntf {

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return new Cup();
	}
	@Override
	public Package getPackage() {
		// TODO Auto-generated method stub
		return new SmallPackage();
	}
}
