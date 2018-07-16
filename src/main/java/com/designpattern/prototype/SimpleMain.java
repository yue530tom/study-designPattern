package com.designpattern.prototype;

import java.io.IOException;

public class SimpleMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PrototypeManageCenter.manageObject();

		AbstractPrototype clonedObjectOne = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototype("one");
		System.out.println("clonedObjectOne myName : " + clonedObjectOne.getMyName());
		
		
		AbstractPrototype clonedObjectOther = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototype("one");
		System.out.println("clonedObjectOther myName : " + clonedObjectOther.getMyName());

		System.err.println("对象是否相同："+(clonedObjectOne==clonedObjectOther));
		System.err.println("对象属性是否相同："+(clonedObjectOne.getMyName()==clonedObjectOther.getMyName()));
		
		
		
		
		AbstractPrototype clonedObjectOneDeep = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototypeDeep("one");
		System.out.println("clonedObjectOneDeep myName : " + clonedObjectOneDeep.getMyName());
		
		
		AbstractPrototype clonedObjectOtherDeep = (AbstractPrototype) PrototypeManageCenter.getAbstractPrototypeDeep("one");
		System.out.println("clonedObjectOtherDeep myName : " + clonedObjectOtherDeep.getMyName());

		System.err.println("对象是否相同："+(clonedObjectOneDeep==clonedObjectOtherDeep));
		System.err.println("对象属性是否相同："+(clonedObjectOneDeep.getMyName()==clonedObjectOtherDeep.getMyName()));
	}
}
