package com.designpattern.adapter;

public class AbstractTV implements MediaTV {

	@Override
	public void watchTV() {
		// TODO Auto-generated method stub
		System.err.println("watch TV");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.err.println("play Game");
	}

	@Override
	public void surfInternet() {
		// TODO Auto-generated method stub
		System.err.println("surf the Internet");
	}

	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		System.err.println("shopping");
	}

	@Override
	public void setShap(String shap) {
		// TODO Auto-generated method stub
		System.err.println("tv shap:"+shap);
	}


}
