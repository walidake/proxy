package com.walidake.static_proxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		Walidake walidake = new Walidake();
		WeddingCompany weddingCompany = new WeddingCompany(walidake);
		weddingCompany.marry();
	}
	
}
