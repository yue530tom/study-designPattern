package com.designpattern.builder;

public class EmployeeForPen implements ProcedureRule {
	private Product product = new Pen();
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		product.createProductAttributes("set Name");
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		product.createProductAttributes("set Color");
	}

	@Override
	public Product getproduct() {
		// TODO Auto-generated method stub
		return product;
	}
}
