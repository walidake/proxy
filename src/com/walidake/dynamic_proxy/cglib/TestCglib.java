package com.walidake.dynamic_proxy.cglib;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.NotFoundException;

public class TestCglib{

	public static void main(String[] args) throws IOException, NotFoundException, CannotCompileException {
		Walidake proxy = new WeddingCompany().getProxy(Walidake.class);
		proxy.marry();
		ReflectUtils.printClass(proxy.getClass());
	}

}
