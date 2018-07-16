package com.designpattern.prototype;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PrototypeClass prototypeClass = new PrototypeClass();
		PrototypeClass prototypeClassNew = prototypeClass.mySelfClone();
		PrototypeClass prototypeClassDeep = (PrototypeClass) prototypeClass.mySelfDeepClone();
		
		//ԭ�������
		prototypeClass.callMe();

		//����������
		prototypeClassDeep.callMe();

		//ǳ�����������
		prototypeClassNew.callMe();
	}
}
