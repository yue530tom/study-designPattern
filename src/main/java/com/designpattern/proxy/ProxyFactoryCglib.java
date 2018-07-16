package com.designpattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactoryCglib implements MethodInterceptor {
	// ά��Ŀ�����
	private Object target;

	public ProxyFactoryCglib(Object target) {
		this.target = target;
	}

	// ��Ŀ����󴴽�һ���������
	public Object getProxyInstance() {
		// ������
		Enhancer enhancer = new Enhancer();
		// ���ø���
		enhancer.setSuperclass(target.getClass());
		// ���ûص�����
		enhancer.setCallback(this);
		// ��������(�������)
		return enhancer.create();

	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		before();

		// ִ��Ŀ�����ķ���
		Object returnValue = method.invoke(target, args);

		after();

		return returnValue;
	}
	
	private void before() {
		System.err.println("Cglib�������֮ǰ����");
	}
	private void after() {
		System.err.println("Cglib�������֮�󡭡�");
	}
}
