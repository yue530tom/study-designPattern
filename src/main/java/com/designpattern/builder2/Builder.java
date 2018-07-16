package com.designpattern.builder2;

public class Builder {
	private String builder_name;
	private String builder_type;
	private String builder_price;
	private String builder_color;
	private String builder_size;

	public Builder setName(String name) {
		this.builder_name = name;
		return this;
	}
	public Builder setType(String type) {
		this.builder_type = type;
		return this;
	}
	public Builder setPrice(String price) {
		this.builder_price = price;
		return this;
	}
	public Builder setColor(String color) {
		this.builder_color = color;
		return this;
	}
	public Builder setSize(String size) {
		this.builder_size = size;
		return this;
	}

	public Product build() {
		return new Product(builder_name, builder_type, builder_price, builder_color, builder_size);
	}
	
}
