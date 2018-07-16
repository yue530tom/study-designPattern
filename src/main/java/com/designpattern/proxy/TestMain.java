package com.designpattern.proxy;

//���������Ҫʵ�ֽӿ�,����Ŀ�����һ��Ҫʵ�ֽӿ�,�������ö�̬����
public class TestMain {
	public static void main(String[] args) {
		Teacher mathTeacher = new PhysicalTeacherProxy();
		mathTeacher.lesson();
		
		System.err.println();
		
		Teacher teacher = new PhysicalTeacher();
		Teacher physicalTeacherProxy = new PhysicalTeacherProxy(teacher);
		physicalTeacherProxy.lesson();
		
		System.err.println();
		
		Teacher target = new PhysicalTeacher();
        // ��ԭʼ������ com.designpattern.proxy.PhysicalTeacher��
        System.out.println(target.getClass());

        // ��Ŀ����󣬴����������
        Teacher proxy = (Teacher) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   �ڴ��ж�̬���ɵĴ������
        System.out.println(proxy.getClass());

        // ִ�з���   ���������
        proxy.lesson();
        
        
        
        System.err.println();
        
        TeacherClass	teacherClassTtarget = new TeacherClass();

        //�������
        TeacherClass TeacherClassProxy = (TeacherClass)new ProxyFactoryCglib(teacherClassTtarget).getProxyInstance();

        //ִ�д������ķ���
        TeacherClassProxy.lesson();
	}
}
