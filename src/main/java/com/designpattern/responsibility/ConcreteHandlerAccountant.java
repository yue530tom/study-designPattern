package com.designpattern.responsibility;

//核心类，实例化后生成一系列相互持有的对象，构成一条链
public class ConcreteHandlerAccountant extends AbstractHandler implements Handler {
	private String role;  
	  
    public ConcreteHandlerAccountant(String role) {  
        this.role = role;  
    }  
  
    @Override  
    public void handleRequest(String type,double fee) {  
        System.out.println(type+" "+role+" 审批!");  
        if(getHandler()!=null){  
            getHandler().handleRequest(type,fee);  
        }  
    }
    @Override  
    public void handleRequest(String type) { 
    	this.handleRequest(type,0);
    }
}
