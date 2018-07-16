package com.designpattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactoryCglib implements MethodInterceptor {
	// 维护目标对象
	private Object target;

	public ProxyFactoryCglib(Object target) {
		this.target = target;
	}

	// 给目标对象创建一个代理对象
	public Object getProxyInstance() {
		// 工具类
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(target.getClass());
		// 设置回调函数
		enhancer.setCallback(this);
		// 创建子类(代理对象)
		return enhancer.create();

	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		before();

		// 执行目标对象的方法
		Object returnValue = method.invoke(target, args);

		after();

		return returnValue;
	}
	
	private void before() {
		System.err.println("Cglib代理调用之前……");
	}
	private void after() {
		System.err.println("Cglib代理调用之后……");
	}
}
