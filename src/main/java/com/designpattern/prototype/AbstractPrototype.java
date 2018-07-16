package com.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class AbstractPrototype implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Object myClone() {
		Object cloneObject = null;
		try {
			cloneObject = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return cloneObject;
	}

	public Object myDeepClone() throws IOException, ClassNotFoundException {
		//将对象写到流里
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		// 从流里读回来
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		return objectInputStream.readObject();
	}
}
