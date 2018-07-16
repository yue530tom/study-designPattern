package com.designpattern.strategy;

public class TestMain {
	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
		Strategy strategy = new ConcreteStrategyA();
		// 创建环境
		Context context = new Context(strategy);
		// 执行业务逻辑
		String result = context.contextMethod();
		System.out.println("业务逻辑返回结果为：" + result);
		
		strategy = new ConcreteStrategyB();
		context = new Context(strategy);
		result = context.contextMethod();
		System.out.println("业务逻辑返回结果为：" + result);
	}
}
