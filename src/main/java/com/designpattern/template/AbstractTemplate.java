package com.designpattern.template;

public abstract class AbstractTemplate {
	//模板方法
    public void playDVD(){
        //调用基本方法
    	openPower();
        openTV();
        operateDVD();
    }
    //基本方法的声明（由子类实现）
    protected abstract void operateDVD();
    //基本方法（已经实现）
    private final void openPower(){
        System.err.println("打开总电源……");
    }
    protected void openTV(){
    	System.err.println("使用遥控器打开TV开关……");
    }
}
