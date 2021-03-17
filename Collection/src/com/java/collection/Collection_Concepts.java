package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_Concepts {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>(); // List next ctrl+spc default varum header file & Integer...
		                                             // Array list next ctrl+spc default header file &Integer...
	
      List<Integer> li1 = new ArrayList<Integer>();

	li.add(10);
	li.add(20);
	li.add(10);
	li.add(40);
	li.add(50);
	
	
	System.out.println(li);
	
	
	li1.add(60);
	li1.add(40);
	li1.add(30);
	 System.out.println(li1);
	  li.addAll(li1);
	  System.out.println(li);
	
	     //size                              //---> starts from 1
		int size = li.size();
		System.out.println(size);
		
		//get -->starts from 0
		Integer integer = li.get(3); // 3 ---> value 40
		System.out.println(integer);
		
		//contains--->boolean
		boolean contains = li.contains(50);// 50 ---->check value 50 is present or not
		System.out.println(contains);
		
		
	// remove -----> no return type
		 li.remove(3); // starts from 0
		 System.out.println(li);
		 
		 // indexof ------> starts from 0 
		 int indexOf = li.indexOf(50);
		 System.out.println(indexOf);
		
		//clear
		 li.clear();
		 System.out.println(li);
		 
		 //retainAll
		 li.retainAll(li1);
		 System.out.println(li);
		 
		 //removeAll
		 li.removeAll(li);
		 System.out.println(li1);
		 
		 
		
		
	}
}
