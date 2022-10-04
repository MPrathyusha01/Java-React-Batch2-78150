package com.hexaware.streamsinjava8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExamplesWithoutStreams {
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int num = it.next();
			if(num >0) {
				sum +=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(45);
		listOfIntegers.add(41);
		listOfIntegers.add(24);
		listOfIntegers.add(23);
		listOfIntegers.add(67);
		int result = sumIterator(listOfIntegers);
		System.out.println("Sum of all values = "+result);
		
		//using streams
		Stream<Integer> sequentialStream = listOfIntegers.stream();
		
		// parallel stream
		
		Stream<Integer> parallelStream = listOfIntegers.parallelStream();
		
		long count = sequentialStream.count();
		System.out.println(count);
		List<Integer> filterData = sequentialStream.filter(value -> value >35).map(value -> value).collect(Collectors.toList());
		System.out.println(filterData);
		
		//Sum of all values in the list using streams
		Integer sum = parallelStream.collect(Collectors.summingInt(Integer::intValue));
		
	}

}
