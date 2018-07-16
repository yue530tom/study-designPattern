package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.List;

public class FlyweightFactory2 {
	private HashMap<String,Flyweight> hashMap = new HashMap<String,Flyweight>();
    /**
     * ������Ԫ��������
     */
    public Flyweight factory(List<String> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        
        for(String state : compositeState){
            compositeFly.add(state,this.factory(state));
        }
        
        return compositeFly;
    }
    /**
     * ������Ԫ��������
     */
    public Flyweight factory(String state){
        //�ȴӻ����в��Ҷ���
        Flyweight fly = hashMap.get(state);
        if(fly == null){
            //������󲻴����򴴽�һ���µ�Flyweight����
            fly = new ConcreteFlyweight(state);
            //������µ�Flyweight������ӵ�������
            hashMap.put(state, fly);
        }
        return fly;
    }
}
