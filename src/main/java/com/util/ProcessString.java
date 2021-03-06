package com.util;

import java.util.HashSet;
import java.util.Set;

public class ProcessString {
	public Set<String> getAllWordSets(String str){
		char[] cs = str.toCharArray();
		Set<String> words = new HashSet<>();
		for(int i=1; i<= cs.length; i++)
			words.addAll(getWordList(cs, i));
		return words;
	}
		
	public Set<String> getWordList(char arr[], int strLen){
		int len = arr.length;
		Set<String> wordSet = new HashSet<>();
		String str = "";
	    for (int i = 0; i < (int)Math.pow(len, strLen); i++) {	        
	    	str = getALengthString(i, arr, strLen);
	    	if(Dictionary.isEnglishWord(str))
	    		wordSet.add(str);
	    }
//	    System.out.println(set);
//	    System.out.println(set.size());
	    return wordSet;
	}

	private String getALengthString(int nth, char arr[], int strLen){		
		int arrLen = arr.length;
		StringBuilder sb = new StringBuilder();
		
	    for (int i = 0; i < strLen; i++) {
	        sb.append(arr[nth % arrLen]);
	        nth /= arrLen;
	    }
//	    System.out.println(sb);
	    return sb.toString();
	}
}
