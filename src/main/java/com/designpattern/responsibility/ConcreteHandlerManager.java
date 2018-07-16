package com.designpattern.responsibility;

//�����࣬ʵ����������һϵ���໥���еĶ��󣬹���һ����
public class ConcreteHandlerManager extends AbstractHandler implements Handler {
	private String role;  
	  
    public ConcreteHandlerManager(String role) {  
        this.role = role;  
    }  
  
    @Override  
    public void handleRequest(String type,double fee) { 
    	if (fee<=3000) {
    		System.out.println(type+" "+role+" ����!");  
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
