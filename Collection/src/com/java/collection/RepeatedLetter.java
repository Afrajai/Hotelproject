package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedLetter {
	public static void main(String[] args) {
		
		String s = "welcomeeejavacoursetogreens ";   
		char[] ch =s.toCharArray();
	//System.out.println(ch);
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		//System.out.println(charMap);
		
	
		for (char c : ch) {
			//System.out.println(charMap);
			//System.out.println(c);
			if(charMap.containsKey(c))  
			{
				//System.out.println(c);
				Integer it = charMap.get(c);
				//System.out.println("it values" + it);
				charMap.put(c,it +1);
				
			}
				else
				{
					charMap.put(c, 1);
				}
		}
		System.out.println(charMap);
		//charMap.cntrl + space kudutha entryset default ah varum
		//cntrl2 kudutha Set<Entry<Character, Integer>> entrySet default ah varum
		//fore kudutha for (Entry<Character, Integer> entry : entrySet) default ah varum
		
			Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		    for (Entry<Character, Integer> entry : entrySet) {
		  
		    	if(entry.getValue()>1)
		    	{
			    	

		    	System.out.println(entry);
		    	}
			
		}
}
}


		    
			
	
	





	
	
	
	
	
	
	
	

