package com.walidake.dynamic_proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WeddingCompany implements InvocationHandler {

	private Object object;

	public WeddingCompany(Object object) {
		this.object = object;
	}

	@SuppressWarnings("unchecked")
	public <T> T getProxy() {
		return (T) Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(), object.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if ("marry".equals(method.getName())) {
			System.out.println("婚礼筹备");

			method.invoke(object, args);

			System.out.println("婚礼结束");
		}
		return null;
	}

	

}
