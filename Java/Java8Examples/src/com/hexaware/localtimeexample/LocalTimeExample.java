package com.hexaware.localtimeexample;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		// system time or current time
		LocalTime time = LocalTime.now();
		System.out.println("Now time is: "+ time);
		
		// spectific time
		LocalTime foodDeliveryTime = LocalTime.of(12,20,25,40);
		System.out.println("Food Delivery time  is: "+ foodDeliveryTime);
		
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Kolkata time:"+ timeKolkata);
		
		LocalTime timeKorea = LocalTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("Korea time: "+timeKorea);
		
		LocalTime timeJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Japan time: "+timeJapan);
		
		System.out.println(timeKolkata.plusHours(5));
		System.out.println(timeKorea.minusHours(5));

	}

}
