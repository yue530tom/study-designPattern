package com.designpattern.bridge;


//����һ���ţ�����Driver��һ��ʵ��
public abstract class DriverManage {
	private Driver driver;

	public void getConn() {
		driver.getConn();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
