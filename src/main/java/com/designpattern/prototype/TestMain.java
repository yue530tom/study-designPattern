package com.designpattern.prototype;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PrototypeClass prototypeClass = new PrototypeClass();
		PrototypeClass prototypeClassNew = prototypeClass.mySelfClone();
		PrototypeClass prototypeClassDeep = (PrototypeClass) prototypeClass.mySelfDeepClone();
		
		//原对象调用
		prototypeClass.callMe();

		//深拷贝对象调用
		prototypeClassDeep.callMe();

		//浅拷贝对象调用
		prototypeClassNew.callMe();
	}
}
