package com.java;

public class Girl implements Boy{
	@Override
	public void boyName() {
		System.out.println("nourin");
		// TODO Auto-generated method stub
		
	}@Override
	public void girlName() {
		System.out.println("jainul");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Girl g = new Girl();
		g.boyName();
		g.girlName();
	}

}
