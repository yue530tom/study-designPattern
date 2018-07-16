package com.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Pen implements Product {
	private List<String> attributes = new ArrayList<String>();

	@Override
	public void createProductAttributes(String attbute) {
		// TODO Auto-generated method stub
		attributes.add(attbute);
	}

	@Override
	public void showAttributes() {
		// TODO Auto-generated method stub
		for (String attribute : attributes) {
			System.out.println(attribute);
		}
	}

}
