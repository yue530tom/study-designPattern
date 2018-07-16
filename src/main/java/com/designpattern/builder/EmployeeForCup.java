package com.designpattern.builder;

public class EmployeeForCup implements ProcedureRule {
	private Product product = new Cup();
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		product.createProductAttributes("cup set Name");
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		product.createProductAttributes("cup set Color");
	}

	@Override
	public Product getproduct() {
		// TODO Auto-generated method stub
		return product;
	}
}
