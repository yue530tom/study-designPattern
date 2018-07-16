package com.designpattern.bridge;

public class TestMain {

	public static void main(String[] args) {
		DriverManage driverManage = new MysqlDriverManage();
		
		Driver driver = new MysqlDriver();
		driverManage.setDriver(driver);
		driverManage.getConn();
		
		driver= new OracleDriver();
		
		driverManage.setDriver(driver);
		driverManage.getConn();
	}
}
