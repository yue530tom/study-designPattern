package com.designpattern.command;

//�����߽�ɫ�� ʿ�����ߴ����
public class Receiver {
	//����ִ��������Ӧ�Ĳ���
    public void gather(){
        System.out.println("���ϡ���");
    }
    public void run(String km) {
    	System.err.println("����ԽҰ���� "+km+"KM");
    }
}
