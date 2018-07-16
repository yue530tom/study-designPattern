package com.designpattern.strategy;

public class TestMain {
	public static void main(String[] args) {
		// ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		Strategy strategy = new ConcreteStrategyA();
		// ��������
		Context context = new Context(strategy);
		// ִ��ҵ���߼�
		String result = context.contextMethod();
		System.out.println("ҵ���߼����ؽ��Ϊ��" + result);
		
		strategy = new ConcreteStrategyB();
		context = new Context(strategy);
		result = context.contextMethod();
		System.out.println("ҵ���߼����ؽ��Ϊ��" + result);
	}
}
