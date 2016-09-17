package com.walidake.static_proxy;

public class WeddingCompany implements Marry{

	private Walidake walidake;
	
	public WeddingCompany(Walidake walidake) {
		this.walidake = walidake;
	}
	
	@Override
	public void marry() {
		System.out.println("婚礼筹备");
		
		walidake.marry();
		
		System.out.println("婚礼结束");
		
	}

}
