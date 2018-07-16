package com.designpattern.adapter;

public class PandaTv extends AbstractTV{

	@Override
	public void shopping() {
		System.err.println("nonsupport");
	}
}
