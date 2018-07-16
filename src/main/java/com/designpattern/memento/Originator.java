package com.designpattern.memento;

public class Originator {
	
	private String value;

	/**
	 * 工厂方法，返回一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(value);
	}

	/**
	 * 将发起人恢复到备忘录对象所记载的value
	 */
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
		System.out.println("当前值：" + this.value);
	}
}
