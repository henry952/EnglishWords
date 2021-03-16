package com;

import java.util.Set;

import com.util.ProcessString;

public class FindEnglishWords {
	 
	public static void main(String[] args) {
	
		Set<String> validWords; // = new HashSet<String>();
		ProcessString ps = new ProcessString();
		String inputStr = "Workingu";
		int samples = 1000000;

		validWords = ps.findWordsFromString(inputStr, samples);
		System.out.println(validWords.size());
//		System.out.println(validWords);
	}
	
	
}
