package com.designpattern.memento;

public class TestMain {
	public static void main(String[] args) {

		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		// 改变负责人对象的value
		originator.setValue("1");
		// 创建备忘录对象，并将发起人对象的value储存起来
		caretaker.saveMemento(originator.createMemento());
		// 修改发起人的value
		originator.setValue("one");
		// 恢复发起人对象的value
		originator.restoreMemento(caretaker.retrieveMemento());

		System.out.println("恢复值："+originator.getValue());
	}
}
