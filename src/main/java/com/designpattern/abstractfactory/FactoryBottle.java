package com.designpattern.abstractfactory;

public class FactoryBottle implements FactoryIntf {

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public Package getPackage() {
		// TODO Auto-generated method stub
		return new BigPackage();
	}

}
