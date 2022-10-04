package com.hexaware.optionalcalssexample;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[10];
//		String lowerCaseString = str[5].toLowerCase();
		Optional<String> checknull = Optional.ofNullable(str[5]);
		if(checknull.isPresent()) {
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}else {
			System.out.println("String value is not present");
		}
	}

}
