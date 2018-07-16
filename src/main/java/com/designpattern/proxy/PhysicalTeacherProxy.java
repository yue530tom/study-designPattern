package com.designpattern.proxy;

public class PhysicalTeacherProxy implements Teacher{

	Teacher teacher ;
	
	//构造函数：以下两种写法均可~
	//普通代理
	public PhysicalTeacherProxy() {
		// TODO Auto-generated constructor stub
		this.teacher=new PhysicalTeacher();
	}
	//强制代理
	public PhysicalTeacherProxy(Teacher teacher) {
		// TODO Auto-generated constructor stub
		this.teacher=teacher;
	}
	@Override
	public void lesson() {
		// TODO Auto-generated method stub
		System.err.println("你们体育老师生病了，我来替你们上课，万幸没被语数外抢去……balabala……");
		teacher.lesson();
		System.err.println("今天表现都很棒，全体都有！奖励你们围操场5圈！快！快！快！动起来");
	}

}
