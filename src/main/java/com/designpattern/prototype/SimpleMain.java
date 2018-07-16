package com.designpattern.prototype;

import java.io.IOException;

public class SimpleMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PrototypeManageCenter.manageObject();

		AbstractPrototype clonedObjectOne = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototype("one");
		System.out.println("clonedObjectOne myName : " + clonedObjectOne.getMyName());
		
		
		AbstractPrototype clonedObjectOther = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototype("one");
		System.out.println("clonedObjectOther myName : " + clonedObjectOther.getMyName());

		System.err.println("�����Ƿ���ͬ��"+(clonedObjectOne==clonedObjectOther));
		System.err.println("���������Ƿ���ͬ��"+(clonedObjectOne.getMyName()==clonedObjectOther.getMyName()));
		
		
		
		
		AbstractPrototype clonedObjectOneDeep = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototypeDeep("one");
		System.out.println("clonedObjectOneDeep myName : " + clonedObjectOneDeep.getMyName());
		
		
		AbstractPrototype clonedObjectOtherDeep = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototypeDeep("one");
		System.out.println("clonedObjectOtherDeep myName : " + clonedObjectOtherDeep.getMyName());

		System.err.println("�����Ƿ���ͬ��"+(clonedObjectOneDeep==clonedObjectOtherDeep));
		System.err.println("���������Ƿ���ͬ��"+(clonedObjectOneDeep.getMyName()==clonedObjectOtherDeep.getMyName()));
	}
}
