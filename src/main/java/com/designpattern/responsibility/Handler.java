package com.designpattern.responsibility;

public interface Handler {
	//��������ķ���
	public void handleRequest(String type,double fee); 
	public void handleRequest(String type); 
}
