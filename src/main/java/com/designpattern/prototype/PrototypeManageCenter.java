package com.designpattern.prototype;

import java.io.IOException;
import java.util.Hashtable;

public class PrototypeManageCenter {
	
	private static Hashtable<String, AbstractPrototype> abstractPrototypeMap = new Hashtable<String, AbstractPrototype>();

	public static AbstractPrototype getAbstractPrototype(String myName) {

		AbstractPrototype abstractPrototype = abstractPrototypeMap.get(myName);
		return (AbstractPrototype) abstractPrototype.myClone();
	}

	public static AbstractPrototype getAbstractPrototypeDeep(String myName) throws ClassNotFoundException, IOException {

		AbstractPrototype abstractPrototype = abstractPrototypeMap.get(myName);
		return (AbstractPrototype) abstractPrototype.myDeepClone();
	}
	public static void manageObject() {
		PrototypeSpecific prototypeImplOne = new PrototypeSpecific();
		prototypeImplOne.setMyName("xiao ming");
		abstractPrototypeMap.put("one", prototypeImplOne);
	}
}
