package com.walidake.dynamic_proxy.cglib;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.objectweb.asm.ClassWriter;

public class WeddingCompany implements MethodInterceptor {

	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> clazz) {
		Enhancer en = new Enhancer();
		// 进行代理
		en.setSuperclass(clazz);
		en.setCallback(this);

		// 生成代理实例
		T t = (T) en.create();

		
		return t;
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		Object result = null;

		if ("marry".equals(method.getName())) {
			System.out.println("婚礼筹备");

			// 通过继承的方法实现代理，因此这里调用的是invokeSuper
			result = methodProxy.invokeSuper(object, args);

			System.out.println("婚礼结束");
		}
		return result;
	}

}
