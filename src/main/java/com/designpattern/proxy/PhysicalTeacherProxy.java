package com.designpattern.proxy;

public class PhysicalTeacherProxy implements Teacher{

	Teacher teacher ;
	
	//���캯������������д������~
	//��ͨ����
	public PhysicalTeacherProxy() {
		// TODO Auto-generated constructor stub
		this.teacher=new PhysicalTeacher();
	}
	//ǿ�ƴ���
	public PhysicalTeacherProxy(Teacher teacher) {
		// TODO Auto-generated constructor stub
		this.teacher=teacher;
	}
	@Override
	public void lesson() {
		// TODO Auto-generated method stub
		System.err.println("����������ʦ�����ˣ������������ϿΣ�����û����������ȥ����balabala����");
		teacher.lesson();
		System.err.println("������ֶ��ܰ���ȫ�嶼�У���������Χ�ٳ�5Ȧ���죡�죡�죡������");
	}

}
