package com.designpattern.factory;

public class TestMain {

	public static void main(String[] args) {
		//������ͨ������������
		Factory factory = new Factory();
		factory.getProduct("cup").getName();	
		//���Զ๤����������
		MulitFactoryMethod mulitFactoryMethod = new MulitFactoryMethod();
		mulitFactoryMethod.getCan().getName();
		//���Ծ�̬������������
		StaticFactory.getBottle().getName();
	}
}
