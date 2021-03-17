package com.selenium.center;

public class PojoA extends Pojo {
	public static void main(String[] args) {
		Pojo p =new Pojo();
		p.setI(25000);
		
		int i = p.getI();
		System.out.println(i);
	}

}
