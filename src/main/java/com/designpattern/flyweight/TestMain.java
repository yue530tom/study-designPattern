package com.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		// 定义外部状态
		int extState = 10; 
		// 初始化享元工厂
		FlyweightFactory factory = new FlyweightFactory(); 

		Flyweight fa = factory.GetFlyweight("A");
		fa.operation(--extState);

		Flyweight fb = factory.GetFlyweight("B");
		fb.operation(--extState);

		Flyweight fd = factory.GetFlyweight("D");
		fd.operation(--extState);

		List<String> compositeState = new ArrayList<String>();
        compositeState.add("a");
        compositeState.add("b");
        compositeState.add("c");
        compositeState.add("a");
        compositeState.add("b");
        
        FlyweightFactory2 flyFactory = new FlyweightFactory2();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation(--extState);
        
        System.out.println("---------------------------------");        
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
        
        String state = "a";
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}
}
