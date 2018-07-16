package com.designpattern.bridge;

//定义实现类
public class MysqlDriver implements Driver{

	@Override
	public void getConn() {
		// TODO Auto-generated method stub
		System.err.println("connect mysql driver");
	}

}
