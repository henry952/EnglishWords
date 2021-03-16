package com.test;

import java.util.Set;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.util.ProcessString;
import com.util.VerifyEnglishWords;

public class WordTest {
	VerifyEnglishWords verifWords;
	ProcessString ps;
	
	public WordTest() {
		verifWords = new VerifyEnglishWords();
		ps = new ProcessString(); 
	}
	@Test
	public void validateStringsAreWords() {
		// prepare test data and verification data
		String inputStr = "Working";
		int num = 5000;
		Set<String> words = ps.findWordsFromString(inputStr, num);
		int expected = 100;
		
		// must get 100% in real dictionary, but won't get 100% here because of only small percentage passed in mocked function 
		int percentage = verifWords.validStringsAreWords(words); 
		System.out.println(percentage + "% of input strings are real English words.");
		Assert.assertTrue(percentage == expected);
	}
}
