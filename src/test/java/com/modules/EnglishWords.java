package com.modules;

import java.util.HashSet;
import java.util.Set;

import com.util.Dictionary;

public class EnglishWords {
	Set<String> words;
	
	public Set<String> getWordSet(String str) {
		if(words == null) {
			char[] cs = str.toCharArray();
			words = new HashSet<>();
			for(int i=1; i<= cs.length; i++)
				words.addAll(getWordList(cs, i));
		}
		
		return words;
	}
	
	private Set<String> getWordList(char arr[], int strLen){
		int len = arr.length;
		Set<String> wordSet = new HashSet<>();
		String str = "";
	    for (int i = 0; i < (int)Math.pow(len, strLen); i++) {	        
	    	str = getALengthString(i, arr, strLen);
	    	if(Dictionary.isEnglishWord(str))
	    		wordSet.add(str);
	    }
//	    System.out.println(wordSet);
//	    System.out.println(wordSet.size());
	    return wordSet;
	}
	
	private String getALengthString(int nth, char arr[], int strLen){		
		int arrLen = arr.length;
		StringBuilder sb = new StringBuilder();
		
	    for (int i = 0; i < strLen; i++) {
	        sb.append(arr[nth % arrLen]);
	        nth /= arrLen;
	    }
	    return sb.toString();
	}
}
