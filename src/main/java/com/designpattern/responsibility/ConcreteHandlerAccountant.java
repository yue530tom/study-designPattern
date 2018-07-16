package com.designpattern.responsibility;

//�����࣬ʵ����������һϵ���໥���еĶ��󣬹���һ����
public class ConcreteHandlerAccountant extends AbstractHandler implements Handler {
	private String role;  
	  
    public ConcreteHandlerAccountant(String role) {  
        this.role = role;  
    }  
  
    @Override  
    public void handleRequest(String type,double fee) {  
        System.out.println(type+" "+role+" ����!");  
        if(getHandler()!=null){  
            getHandler().handleRequest(type,fee);  
        }  
    }
    @Override  
    public void handleRequest(String type) { 
    	this.handleRequest(type,0);
    }
}
