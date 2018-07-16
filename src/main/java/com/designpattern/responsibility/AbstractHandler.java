package com.designpattern.responsibility;

public abstract class AbstractHandler {
	//持有后继的责任对象
	private Handler handler;  
	  
    public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
}
