package org.emp;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.println("enter emp id");
	int fb = ss.nextInt();
	System.out.println("enter id" + fb );
		
		
	System.out.println(" emp name");
	String gg = ss.next();
	System.out.println("name " + gg);
	
	
System.out.println("marks");
int m1 = ss.nextInt();
	System.out.println("m1 marks" + m1);
	
	
	System.out.println("marks");
	int m2 = ss.nextInt();
		System.out.println("m2 marks" + m2);
		
		System.out.println("marks");
		int m3 = ss.nextInt();
			System.out.println("m3 marks" + m3);
			
			System.out.println("marks");
			int m4 = ss.nextInt();
				System.out.println("m4 marks" + m4);
				
				System.out.println("marks");
				int m5 = ss.nextInt();
					System.out.println("m5 marks" + m5);
					int  sum;
					sum=m1+m2+m3+m4+m5;
					System.out.println("sum" + sum);
					 int avg;
					 avg = sum/5;
					 System.out.println("avg" + avg);
					
					
	
	}

}
