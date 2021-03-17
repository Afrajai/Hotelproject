package org.test;

public class A {
	public A()
	{
		this ("JAVA");
		System.out.println("default cons...");
	
	}
	public A(int id)
	{
		this(3456.5678f);
		System.out.println(id);
	}
	public A(float sal) {
		System.out.println(sal);
	}
public A(String name)
{
	this(12);
	System.out.println(name);
}
public static void main(String[] args) {
	A a =new A();
}

}

