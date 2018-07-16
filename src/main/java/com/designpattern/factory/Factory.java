package com.designpattern.factory;

public class Factory {

	public Container getProduct(String productType) {


		if (productType.equalsIgnoreCase("cup")) {
			return new Cup();
		} else if (productType.equalsIgnoreCase("can")) {
			return new Can();
		}else if (productType.equalsIgnoreCase("bottle")) {
			return new Bottle();
		} else {
			return null;
		}

	}
}
