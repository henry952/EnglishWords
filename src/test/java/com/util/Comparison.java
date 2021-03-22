package com.util;

import java.util.Set;

public class Comparison {
	public boolean isWordSetsIdentical(Set<String> set1, Set<String> set2) {
		if(set1.size() != set2.size())
			return false;
		for(String s : set1)
			if(!set2.contains(s)) 
				return false;
					
		return true;
	}
}
