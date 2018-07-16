package com.designpattern.responsibility;

public interface Handler {
	//处理请求的方法
	public void handleRequest(String type,double fee); 
	public void handleRequest(String type); 
}
