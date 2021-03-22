package com;

import java.util.HashSet;
import java.util.Set;

import com.util.ProcessString;

public class FindEnglishWords {
	 
	public static void main(String[] args) {
	
		Set<String> validWords = new HashSet<String>();
		ProcessString ps = new ProcessString();
		String inputStr = "Working";
		char[] cs = inputStr.toCharArray();

		for(int i=1; i<=cs.length; i++)
			validWords.addAll(ps.getWordList(cs,i));

		System.out.println(validWords.size());
//		System.out.println(validWords);
	}	
}
