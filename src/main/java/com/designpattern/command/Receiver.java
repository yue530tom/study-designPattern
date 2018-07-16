package com.designpattern.command;

//接收者角色类 士兵或者传令官
public class Receiver {
	//真正执行命令相应的操作
    public void gather(){
        System.out.println("集合……");
    }
    public void run(String km) {
    	System.err.println("负重越野…… "+km+"KM");
    }
}
