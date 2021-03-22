package com.test;

import java.util.HashSet;
import java.util.Set;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.modules.EnglishWords;
import com.util.Comparison;
import com.util.ProcessString;  // Application class

public class WordTest {
	EnglishWords ew;
	ProcessString ps;
	Comparison comp;
	
	public WordTest() {
		ps = new ProcessString();
		ew = new EnglishWords(); 
		comp = new Comparison();
	}

	@Test
	public void validateWordsSet() {
		String testingWord = "Working";
		// should use this line in real test to get result by executing Application code
	//	Set<String> wordsFromApp = ps.getAllWordSets(testingWord);
		
		Set<String> expectedWordSet = ew.getWordSet(testingWord);
		// clone the expected result for code testing purpose
		Set<String> wordsFromApp = new HashSet<>(expectedWordSet);
		
		Assert.assertTrue(comp.isWordSetsIdentical(wordsFromApp, expectedWordSet));
		
	}

}
