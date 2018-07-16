package com.designpattern.bridge;


//定义一个桥，持有Driver的一个实例
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
