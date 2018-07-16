package com.designpattern.flyweight;

public class ConcreteFlyweight extends Flyweight{
	
	private String innerState;
	public ConcreteFlyweight(String intrinsicstate) {
		// TODO Auto-generated constructor stub
		this.innerState=intrinsicstate;
	}
	
	@Override
	public void operation(int extState) {
		// TODO Auto-generated method stub
		System.err.println("����ʵ����: �ڲ�״̬ "+innerState+", �ⲿ״̬ "+extState);
	}

}
