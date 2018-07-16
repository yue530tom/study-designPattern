package com.designpattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	public HashMap<String, Flyweight> flyweights = new HashMap<>();
	 
    public FlyweightFactory()
    {
        flyweights.put("A", new ConcreteFlyweight("A"));
        flyweights.put("B", new ConcreteFlyweight("B"));
        flyweights.put("C", new ConcreteFlyweight("C"));
    }
 
    public Flyweight GetFlyweight(String key)
    {
        if (!flyweights.containsKey(key))
        {
           
            System.err.println("²»´æÔÚ:"+key);
 
            flyweights.put(key, new ConcreteFlyweight(key));
        }
 
        return flyweights.get(key);
    }
}
