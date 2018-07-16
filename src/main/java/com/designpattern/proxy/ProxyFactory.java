package com.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	// 维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 执行目标对象方法
						before();
						Object returnValue = method.invoke(target, args);
						after();
						return returnValue;
					}
				});
	}
	private void before() {
		System.err.println("代理调用之前……");
	}
	private void after() {
		System.err.println("代理调用之后……");
	}
}
