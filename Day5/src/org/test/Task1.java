package org.test;

public class Task1 {
	public Task1()
	{
		this("JAVA");
		System.out.println("Default const...");
}
	public Task1(int id)
	{
		this(3456.5678f);
		System.out.println(id);
}
	public Task1(String name)
	{
		this(12);
		System.out.println(name);
}
	
	public Task1(float sal)
	{
		
		System.out.println(sal);
}
	public static void main(String[] args) {
		Task1 a = new Task1();
		
	}
}