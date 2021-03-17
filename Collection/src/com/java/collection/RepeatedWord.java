package com.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWord {
	public static void main(String[] args) {
		String s = "by the people of the people for the people";
		String[] split = s.split(" ");
		
		 Map<String, Integer> word = new HashMap<String, Integer>();
		
	for (String key: split) {
		
		if(word.containsKey(key))
			
		{
			//Integer value =word.get(key);
			word.put(key, word.get(key) +1);
			
		}
		else 
		{
			word.put(key, 1);
			
		}
	}
		System.out.println(word);
	
		//duplicate words only display
		System.out.println("duplicate values");
		
		Set<Entry<String, Integer>> entrySet = word.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() >1)
			{
				System.out.println(entry);
			}
		}

	
	}
		


		}
		
		
	

	


