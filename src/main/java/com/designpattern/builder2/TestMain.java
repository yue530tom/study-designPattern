package com.designpattern.builder2;

public class TestMain {

	public static void main(String[] args) {
		Product product=new Builder().setColor("color").setName("name").build();
		System.err.println(product.getColor());
		System.err.println(product.getName());
		System.err.println(product.getPrice());
		
		
		Builder builder = new Builder();
		Master master = new Master(builder);
		product=master.build();
		System.err.println(product.getColor());
		System.err.println(product.getName());
		System.err.println(product.getPrice());
	}
}
