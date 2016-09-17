package com.walidake.dynamic_proxy.proxy;

import java.io.FileOutputStream;

public class Generator {

	public static void main(String[] args) {
		createProxyClassFile();
	}

	@SuppressWarnings("restriction")
	public static void createProxyClassFile() {
		String name = "CustomProxy";
		byte[] data = sun.misc.ProxyGenerator.generateProxyClass(name,
				new Class[] { Marry.class });
		try {
			FileOutputStream out = new FileOutputStream(name + ".class");
			out.write(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
