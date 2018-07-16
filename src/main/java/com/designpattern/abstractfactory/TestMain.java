package com.designpattern.abstractfactory;

public class TestMain {

	public static void main(String[] args) {
		FactoryIntf factoryIntf = new FactoryBottle();
		factoryIntf.getContainer().getName();
		factoryIntf.getPackage().getPackageSize();
	}
}
