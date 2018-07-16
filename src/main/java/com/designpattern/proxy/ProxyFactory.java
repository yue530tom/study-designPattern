package com.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	// ά��һ��Ŀ�����
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// ִ��Ŀ����󷽷�
						before();
						Object returnValue = method.invoke(target, args);
						after();
						return returnValue;
					}
				});
	}
	private void before() {
		System.err.println("�������֮ǰ����");
	}
	private void after() {
		System.err.println("�������֮�󡭡�");
	}
}
