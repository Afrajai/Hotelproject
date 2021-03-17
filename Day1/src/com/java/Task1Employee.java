package com.java;

public class Task1Employee {
	public void empId()
	{
		System.out.println("Employee id" );
	}
public void empName() {

	System.out.println("Employee Name");
}
public void empDob()
{ 
	System.out.println("Employe Dob");
}
public void empPhone()
{
	System.out.println("Employee Phone");
}
public void empEmail()
{
	System.out.println("Employee Email");
}
public void empAddress()
{
	System.out.println("Employee Address");
}
public static void main(String[] args) {
	Task1Employee ee = new Task1Employee();
	ee.empId();
	ee.empName();
	ee.empDob();
	ee.empPhone();
	ee.empEmail();
	ee.empAddress();
}

}
