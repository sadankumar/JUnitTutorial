package com.sadan.arrayandstring;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniqueChar {
	
private static final int MAX_CODE = 65535;
	
	/**
	 * This API isUnique(String value) checks for the unique characters in a a given String value
	 * @param String value
	 * @return boolean true/false
	 * return the true if the given string value has unique characters, else return false
	 */
	public static boolean isUnique(String value) {
		if(paramNotValid(value)) {
			return false;
		}
		Map<Character, Boolean> charsColl = new HashMap<>();
		for(int i = 0 ; i < value.length() ; i++) {
			char tocken = value.charAt(i);
			if(isNotWhiteSpace(tocken)) {
				if(charsColl.put(tocken, true) != null ) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isNotWhiteSpace(char tocken) {
		return !Character.isWhitespace(tocken);
	}

	private static boolean paramNotValid(String str) {
		if (Objects.isNull(str)){
			return true;
		}
		if (Objects.nonNull(str) && str.length() <= 0){
			return true;
		}
		return false;
	}
	
	private static void delay() {
		for(int i = 0; i < 100000 ; i++) {
			System.out.println("printing value:"+i);
		}
	}

}
