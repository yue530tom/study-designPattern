package com.designpattern.bridge;

public class MysqlDriverManage extends DriverManage {
	public void getConn() {
		getDriver().getConn();
	}
}
