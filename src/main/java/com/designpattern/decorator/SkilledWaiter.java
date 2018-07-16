package com.designpattern.decorator;

public class SkilledWaiter implements Service{

	private Service service; 
	
	public SkilledWaiter(Service service) {
		// TODO Auto-generated constructor stub
		this.service= service;
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.err.println("欢迎光临本店");
		service.service();
		System.err.println("有需要您随时叫我");
	}

}
