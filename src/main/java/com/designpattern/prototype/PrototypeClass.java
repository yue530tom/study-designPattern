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

	//����ķ�������ָ��Ϊ������������õ���super.clone()ʱǿת���õ�ʱ����ǿת��������������д��
	public PrototypeClass mySelfClone() {
		PrototypeClass clone = null;
		try {
			clone = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	//����ķ�������ָ��Ϊobject�õ�ʱ��Ҫǿת
	public Object mySelfDeepClone() throws IOException, ClassNotFoundException {
		//������д������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		// �����������
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public void callMe() {
		System.err.println("talk is cheap,show me the code~!");
	}

}
