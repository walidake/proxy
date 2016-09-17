package com.walidake.dynamic_proxy.proxy;

public class Other implements Marry{
	
	@Override
	public void marry() {
		System.out.println(this.getClass().getSimpleName() + "结婚啦");
	}
	
}
