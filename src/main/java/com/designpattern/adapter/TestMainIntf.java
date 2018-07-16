package com.designpattern.adapter;

public class TestMainIntf {
	public static void main(String[] args) {
		AbstractTV letv = new Letv();
		AbstractTV pandatv = new PandaTv();
		letv.watchTV();
		letv.playGame();
		letv.setShap("方形的");
		letv.surfInternet();
		letv.shopping();
		
		
		System.err.println();
		
		pandatv.watchTV();
		pandatv.playGame();
		pandatv.setShap("臆想形的");
		pandatv.surfInternet();
		pandatv.shopping();
	}
}
