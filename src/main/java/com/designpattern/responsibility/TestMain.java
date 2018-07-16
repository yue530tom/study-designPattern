package com.designpattern.responsibility;

public class TestMain {
	public static void main(String[] args) {

		ConcreteHandler leader = new ConcreteHandler("ֱ���쵼");
		ConcreteHandler manager = new ConcreteHandler("����");
		ConcreteHandler chief = new ConcreteHandler("�ܼ�");
		ConcreteHandler accountant = new ConcreteHandler("����");

		double fee = Math.random() * 9999;

		System.err.println("�Ӱ��:" + fee);

		if (fee <= 3000) {
			leader.setHandler(manager);
			manager.setHandler(accountant);
		} else {
			leader.setHandler(manager);
			manager.setHandler(chief);
			chief.setHandler(accountant);
		}

		leader.handleRequest("�Ӱཻͨ�ѱ���:");

		/*
		 * ConcreteHandlerLeader leader = new ConcreteHandlerLeader("ֱ���쵼");
		 * ConcreteHandlerManager manager = new ConcreteHandlerManager("����");
		 * ConcreteHandlerChief chief = new ConcreteHandlerChief("�ܼ�");
		 * ConcreteHandlerAccountant accountant = new ConcreteHandlerAccountant("����");
		 * 
		 * double fee = Math.random() *9999;
		 * 
		 * System.err.println("�Ӱ��:" + fee);
		 * 
		 * leader.setHandler(manager); manager.setHandler(chief);
		 * chief.setHandler(accountant);
		 * 
		 * leader.handleRequest("�Ӱཻͨ�ѱ���:", fee);
		 */
	}
}
