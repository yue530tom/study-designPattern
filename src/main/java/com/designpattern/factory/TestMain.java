package com.designpattern.factory;

public class TestMain {

	public static void main(String[] args) {
		//测试普通工厂创建对象
		Factory factory = new Factory();
		factory.getProduct("cup").getName();	
		//测试多工厂创建对象
		MulitFactoryMethod mulitFactoryMethod = new MulitFactoryMethod();
		mulitFactoryMethod.getCan().getName();
		//测试静态工厂创建对象
		StaticFactory.getBottle().getName();
	}
}
