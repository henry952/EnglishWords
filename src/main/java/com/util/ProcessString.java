package com.util;

import java.util.HashSet;
import java.util.Set;

public class ProcessString {
	
	public String generateAWord(String str) {
		if(str == null || str.length()== 0 || str.length() == 1)
			return str;
		
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		int wordLen = (int)(Math.random() * len + 1);
		for(int i=0; i<wordLen; i++) {
			int idx = (int)(Math.random() * wordLen);
			sb.append(str.charAt(idx));
		}
		return sb.toString();
	}
	
	public Set<String> findWordsFromString(String str, int num){
		Set<String> validWords = new HashSet<String>();
		
		for(int i=0; i<num; i++) {
			String s = generateAWord(str);
			if(Dictionary.isEnglishWord(s))
				validWords.add(s);
		}
		
		return validWords;
	}
}
