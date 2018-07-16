package com.designpattern.adapter;

public class AdapterClass extends TV implements MultimediaTV {


	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.err.println("play game");
	}

}
