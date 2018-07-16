package com.designpattern.adapter;

public class TestMainObject {
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		MultimediaTV multimediaTV = new AdapterObject(tv);
		multimediaTV.watchTV();
		multimediaTV.playGame();
	}
}
