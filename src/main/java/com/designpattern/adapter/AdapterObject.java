package com.designpattern.adapter;

public class AdapterObject  implements MultimediaTV {

	private TV tv;
	
	public AdapterObject(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv=tv;
	}

	@Override
	public void watchTV() {
		// TODO Auto-generated method stub
		tv.watchTV();
	}
	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.err.println("play game in AdapterObject");
	}

}
