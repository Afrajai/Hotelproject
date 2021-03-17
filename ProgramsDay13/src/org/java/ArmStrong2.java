package org.java;

import java.util.Scanner;

public class ArmStrong2 {
	public static void checkNumberIsArmstrong()
	{
		int i=0, j=0, a,n;
		Scanner sca =new Scanner(System.in);
		System.out.println("enter a number");
		n = sca.nextInt();
		a=n;
		while(a>0)
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
}
		if(n==j)
		{
			System.out.println("Armstrong Number");
		}
			else {
				System.out.println("Not Armstrong Number");
			}
			
		}
		
	public static void main(String[] args) {
		checkNumberIsArmstrong();
		
		
	}

}
