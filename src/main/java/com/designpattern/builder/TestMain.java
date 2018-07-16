package com.designpattern.builder;

public class TestMain {
	public static void main(String[] args) {
		Master master = new Master(new EmployeeForPen());
        Product product = master.build();
        product.showAttributes();
        
        master = new Master(new EmployeeForCup());
        product = master.build();
        product.showAttributes();
	}
}
