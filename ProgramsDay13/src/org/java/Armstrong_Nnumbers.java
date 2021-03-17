package org.java;

import java.util.Scanner;

public class Armstrong_Nnumbers {
	public static void main(String[] args) {
		int num,a,modulo,result=0,power=0,mul=1;
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		a=num;
		System.out.println("value of a:" +a);
		while(a!=0)
		{
			power++;
			a=a/10;
			
}
		System.out.println("power value is:"+power);
		       
	}

}
