package com.designpattern.template;

public abstract class AbstractTemplate {
	//ģ�巽��
    public void playDVD(){
        //���û�������
    	openPower();
        openTV();
        operateDVD();
    }
    //����������������������ʵ�֣�
    protected abstract void operateDVD();
    //�����������Ѿ�ʵ�֣�
    private final void openPower(){
        System.err.println("���ܵ�Դ����");
    }
    protected void openTV(){
    	System.err.println("ʹ��ң������TV���ء���");
    }
}
