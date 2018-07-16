package com.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PrototypeClass implements Cloneable,Serializable{

	public User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserName() {
		return user.getName();
	}

	//这里的返回类型指定为具体类的类型用到在super.clone()时强转，用到时不用强转，但不建议这种写法
	public PrototypeClass mySelfClone() {
		PrototypeClass clone = null;
		try {
			clone = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	//这里的返回类型指定为object用到时需要强转
	public Object mySelfDeepClone() throws IOException, ClassNotFoundException {
		//将对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		// 从流里读回来
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public void callMe() {
		System.err.println("talk is cheap,show me the code~!");
	}

}
