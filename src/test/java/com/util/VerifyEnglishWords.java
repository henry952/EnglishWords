package com.util;

import java.util.Set;

public class VerifyEnglishWords {

	// validate strings to be words - input string set and the percentage in integer is words
	public int validStringsAreWords(Set<String> strs) {
		int counter = 0;
		for (String s : strs) {
			if(Dictionary.isEnglishWord(s))
				counter++;
		}
		int perc = (int)((float)counter / strs.size()) * 100;
		return perc;
	}
}
