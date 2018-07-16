package com.designpattern.builder2;

public class Product {

	private String name;
	private String type;
	private String price;
	private String color;
	private String size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Product(String name, String type, String price, String color, String size) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
		this.size = size;
	}

	public Product(String name, String type, String price, String color) {
		new Product(name, type, price, color, "");
	}

	public Product(String name, String type, String price) {
		new Product(name, type, price, "", "");
	}

	public Product(String name, String type) {
		new Product(name, type, "", "", "");
	}

	public Product(String name) {
		new Product(name, "", "", "", "");
	}

}
