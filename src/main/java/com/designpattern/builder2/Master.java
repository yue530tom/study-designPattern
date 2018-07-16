package com.designpattern.builder2;


public class Master {
	private Builder builder = null;

	public Master(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}

	public Product build() {
		builder.setColor("Master set color");
		builder.setName("Master set name");
		return builder.build();
	}
}
