package com.designpattern.bridge;

//����ʵ����
public class MysqlDriver implements Driver{

	@Override
	public void getConn() {
		// TODO Auto-generated method stub
		System.err.println("connect mysql driver");
	}

}
