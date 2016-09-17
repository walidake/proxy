package com.walidake.dynamic_proxy.proxy;

public class TestProxy {

	public static void main(String[] args) {
		//第一个人
		Walidake walidake = new Walidake();
		Marry marry = new WeddingCompany(walidake).getProxy();
		marry.marry();
		
		System.out.println();
		
		//第二个人
		Other other = new Other();
		Marry marry2 = new WeddingCompany(other).getProxy();
		marry2.marry();
	}
	
}
