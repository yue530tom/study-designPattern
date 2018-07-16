package com.designpattern.builder;

public class Master {

	private ProcedureRule procedureRule = null;

	public Master(ProcedureRule procedureRule) {
		// TODO Auto-generated constructor stub
		this.procedureRule = procedureRule;
	}

	public Product build() {
		procedureRule.setName();
		procedureRule.setColor();
		return procedureRule.getproduct();
	}
}
