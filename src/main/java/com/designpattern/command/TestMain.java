package com.designpattern.command;

public class TestMain {
	 public static void main(String[] args) {
	        //����������
	        Receiver receiver = new Receiver();
	        //������������趨���Ľ�����
	        Command command = new ConcreteCommand(receiver);
	        //���������ߣ�������������ý�ȥ
	        Commander invoker = new Commander(command);
	        //ִ�з���
	        invoker.issueOrders();
	    }
}
