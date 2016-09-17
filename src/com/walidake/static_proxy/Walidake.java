package com.walidake.static_proxy;

public class Walidake implements Marry{

	@Override
	public void marry() {
		System.out.println(this.getClass().getSimpleName() + "结婚啦");
	}
	
}
