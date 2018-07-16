package com.designpattern.template;

public class ConcreteTemplate extends AbstractTemplate{

	@Override
	protected void operateDVD() {
		// TODO Auto-generated method stub
		System.err.println("\t操作DVD:直接打开dvd电源");
		System.err.println("\t操作DVD:使用遥控器打开光盘仓");
		System.err.println("\t操作DVD:放入光盘");
		System.err.println("\t操作DVD:直接关闭光盘仓");
	}

}
