package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.List;

public class FlyweightFactory2 {
	private HashMap<String,Flyweight> hashMap = new HashMap<String,Flyweight>();
    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<String> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        
        for(String state : compositeState){
            compositeFly.add(state,this.factory(state));
        }
        
        return compositeFly;
    }
    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(String state){
        //先从缓存中查找对象
        Flyweight fly = hashMap.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            hashMap.put(state, fly);
        }
        return fly;
    }
}
