package com.designpattern.flyweight;

import java.util.HashMap;

public class ConcreteCompositeFlyweight extends Flyweight {
	private HashMap<String,Flyweight> hashMap = new HashMap<String,Flyweight>();
    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(String key , Flyweight flyweight){
        hashMap.put(key,flyweight);
    }
	@Override
	public void operation(int extState) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
        for(Object o : hashMap.keySet()){
            fly = hashMap.get(o);
            fly.operation(extState);
        }
	}

}
