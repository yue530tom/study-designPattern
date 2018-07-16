package com.designpattern.responsibility;

//核心类，实例化后生成一系列相互持有的对象，构成一条链
public class ConcreteHandlerManager extends AbstractHandler implements Handler {
	private String role;  
	  
    public ConcreteHandlerManager(String role) {  
        this.role = role;  
    }  
  
    @Override  
    public void handleRequest(String type,double fee) { 
    	if (fee<=3000) {
    		System.out.println(type+" "+role+" 审批!");  
		} else {
			if(getHandler()!=null){  
	            getHandler().handleRequest(type,fee);  
	        } 
		}
    } 
    @Override  
    public void handleRequest(String type) { 
    	this.handleRequest(type,0);
    } 
}
