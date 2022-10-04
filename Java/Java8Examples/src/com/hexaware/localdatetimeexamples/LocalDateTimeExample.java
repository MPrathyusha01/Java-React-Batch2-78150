package com.hexaware.localdatetimeexamples;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// system current time and date
		LocalDateTime systemtime = LocalDateTime.now();
		System.out.println("Now time and date is: "+systemtime);
		
		LocalDateTime birthday = LocalDateTime.of(2001, 05, 04, 23, 9,45);
		System.out.println(birthday);
		
	}

}
