package com.designpattern.memento;

public class TestMain {
	public static void main(String[] args) {

		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		// �ı为���˶����value
		originator.setValue("1");
		// ��������¼���󣬲��������˶����value��������
		caretaker.saveMemento(originator.createMemento());
		// �޸ķ����˵�value
		originator.setValue("one");
		// �ָ������˶����value
		originator.restoreMemento(caretaker.retrieveMemento());

		System.out.println("�ָ�ֵ��"+originator.getValue());
	}
}
