package com.designpattern.iterator;

public interface Iterator {
	public Object previous();  
    
    //����  
    public Object next();  
    public boolean hasNext();  
      
    //ȡ�õ�һ��Ԫ��  
    public Object first();   
}
