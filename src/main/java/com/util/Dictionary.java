package com.util;

public class Dictionary {

	public static boolean isEnglishWord(String word) {
		boolean flag = false;
		// set 0.1% of string are English words
		double percent = 0.001; 
		double rand = Math.random() ;
		
		if(rand > 1 - percent)
			flag = true;
	
		return flag;
	}
	
	
}
