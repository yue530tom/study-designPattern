package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Children {

	private List<Senior> seniorList = new ArrayList<Senior>();

	public void add(Senior senior) {
		seniorList.add(senior);
		System.out.println("add senior: "+senior.getClass().getName());
	}

	public void remove(Senior senior) {
		seniorList.remove(senior);
		System.out.println("remove senior: "+senior.getClass().getName());
	}

	public void nodifySeniors(String action) {

		for (Senior senior : seniorList) {
			senior.update(action);
		}
	}
}
