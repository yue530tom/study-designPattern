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
		System.err.println("具体实现类: 内部状态 "+innerState+", 外部状态 "+extState);
	}

}
