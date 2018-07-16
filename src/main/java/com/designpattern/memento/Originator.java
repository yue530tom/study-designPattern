package com.designpattern.memento;

public class Originator {
	
	private String value;

	/**
	 * ��������������һ���µı���¼����
	 */
	public Memento createMemento() {
		return new Memento(value);
	}

	/**
	 * �������˻ָ�������¼���������ص�value
	 */
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
		System.out.println("��ǰֵ��" + this.value);
	}
}
