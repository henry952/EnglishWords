package com.util;

public class Dictionary {

	public static boolean isEnglishWord(String word) {
		boolean flag = false;
		double percent = 0.0001; // set 0.01% of string are English words
		double rand = Math.random() ;
		
//		System.out.println(rand + "\t - " + (rand > (1 - percent)) + "\t => " + (rand - (1 - percent)));
		if(rand > 1 - percent)
			flag = true;
	
		return flag;
	}
	
	
}
