package com.java;

public class String_Concept {
	public static void main(String[] args) {
		
	

	String s = "Weclome To Nourin House";
	//length
	
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals("Weclome To Nourin House");
	System.out.println(equals);
	
	boolean equals2 = s.equals("weclome to Nourin Hous");
	System.out.println(equals2);
	
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("Weclome To Nourin House");
	System.out.println(equalsIgnoreCase);
	
	boolean equalsIgnoreCase2 = s.equalsIgnoreCase("Weclome to Nourin");
	
	System.out.println(equalsIgnoreCase2);
	
	char charAt = s.charAt(5);
	System.out.println(charAt);
	
	String replace = s.replace("To", "All");
	System.out.println(replace);
	
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	
	boolean startsWith = s.startsWith("To");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("house");
	System.out.println(endsWith);
	
	
	System.out.println("------substring--------");
	
	String substring = s.substring(6);
	System.out.println(substring);
	

	String substring2 = s.substring(3, 9);
	System.out.println(substring2);
	
	
	boolean contains = s.contains("To");
	System.out.println(contains);
	
	//1
	int indexOf = s.indexOf("N");
	System.out.println(indexOf);
	//2
	int indexOf2 = s.indexOf("z");
	System.out.println(indexOf2);
	
	//3
	
	int indexOf3 = s.indexOf("e");
	System.out.println(indexOf3);
	
	
	int lastIndex = s.lastIndexOf("e");
	
	System.out.println(lastIndex);
	
	int lastIndexOf = s.lastIndexOf("j");
	
	System.out.println(lastIndexOf);
	
	System.out.println("----------------------remove space----------");
	
	String trim = s.trim();
	System.out.println(trim);
	
	String replace2 = s.replace(" ", "-");
	System.out.println(replace2);
	
	System.out.println("-----String to int------");
	String num ="17";
	System.out.println(num+10);
	Integer valueOf = Integer.valueOf(num);
	System.out.println(valueOf +13);
	
	
	System.out.println("-----int to string-----");
	int n=10;
	System.out.println(n+5);
	 
	String valueeee = String.valueOf(n);
	System.out.println(valueeee +4);
	
	
	
	
	String s1 = " ";
	System.out.println(s1);
	boolean empty = s1.isEmpty();
	System.out.println(empty);
	
	String s2 = "";
	System.out.println(s2);
	boolean empty2 = s2.isEmpty();
	System.out.println(empty2);
	
	String s3=null;
			System.out.println(s3);
			
			
			String s4 ="null";
			System.out.println(s4);
			
			String s78 ="AFRA";
			String s79="NOURIN";
			
	System.out.println(s78);
	String r = s78 .concat(s79);
	System.out.println(r);
	
	
	
	String sss= new String("AFRA");
	
}
}