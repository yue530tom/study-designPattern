package com.designpattern.proxy;

//代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
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
        // 【原始的类型 com.designpattern.proxy.PhysicalTeacher】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        Teacher proxy = (Teacher) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.lesson();
        
        
        
        System.err.println();
        
        TeacherClass	teacherClassTtarget = new TeacherClass();

        //代理对象
        TeacherClass TeacherClassProxy = (TeacherClass)new ProxyFactoryCglib(teacherClassTtarget).getProxyInstance();

        //执行代理对象的方法
        TeacherClassProxy.lesson();
	}
}
