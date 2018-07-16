package com.designpattern.adapter;

public class TestMain {
	public static void main(String[] args) {
		MultimediaTV multimediaTV = new AdapterClass();
		multimediaTV.watchTV();
		multimediaTV.playGame();
	}
}
