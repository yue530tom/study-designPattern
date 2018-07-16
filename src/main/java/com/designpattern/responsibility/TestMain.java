package com.designpattern.responsibility;

public class TestMain {
	public static void main(String[] args) {

		ConcreteHandler leader = new ConcreteHandler("直接领导");
		ConcreteHandler manager = new ConcreteHandler("经理");
		ConcreteHandler chief = new ConcreteHandler("总监");
		ConcreteHandler accountant = new ConcreteHandler("财务");

		double fee = Math.random() * 9999;

		System.err.println("加班费:" + fee);

		if (fee <= 3000) {
			leader.setHandler(manager);
			manager.setHandler(accountant);
		} else {
			leader.setHandler(manager);
			manager.setHandler(chief);
			chief.setHandler(accountant);
		}

		leader.handleRequest("加班交通费报销:");

		/*
		 * ConcreteHandlerLeader leader = new ConcreteHandlerLeader("直接领导");
		 * ConcreteHandlerManager manager = new ConcreteHandlerManager("经理");
		 * ConcreteHandlerChief chief = new ConcreteHandlerChief("总监");
		 * ConcreteHandlerAccountant accountant = new ConcreteHandlerAccountant("财务");
		 * 
		 * double fee = Math.random() *9999;
		 * 
		 * System.err.println("加班费:" + fee);
		 * 
		 * leader.setHandler(manager); manager.setHandler(chief);
		 * chief.setHandler(accountant);
		 * 
		 * leader.handleRequest("加班交通费报销:", fee);
		 */
	}
}
