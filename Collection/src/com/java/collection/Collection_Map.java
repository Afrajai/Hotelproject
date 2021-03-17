package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer , String>();
		
		 m.put(1, "one");
		 m.put(2, "two");
		 m.put(3,"three");
		 m.put(4, "four");
		m.put(5, "five");
		System.out.println(m);
		
		Map<Integer, String> m1 = new HashMap<Integer , String>();
		
		m1.put(1, "one");
	    m1.put(2, "one");
		m1.put(3,"three");
		m1.put(3, "four");
		m1.put(5, "five");
		System.out.println(m1);
		
		
Map<Object, Object> m2 = new HashMap<Object , Object>();
		
		m2.put(1, "one");
	    m2.put(2, "one");
		m2.put(3,"three");
		m2.put(3, "four");
		m2.put(5, "five");
		m2.put("test", 7);
		m2.put("exam","subject");
		m2.put(1, " "); 
		m2.put(8, "apply");
		m2.put(6, null);
		m2.put(7, "");
		m2.put("exam", null);
	
		System.out.println(m2);
		int size = m1.size();
		System.out.println(size);
		
		
		
		
		
		
		 		

}
}

