package com.designpattern.responsibility;

public abstract class AbstractHandler {
	//���к�̵����ζ���
	private Handler handler;  
	  
    public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
}
