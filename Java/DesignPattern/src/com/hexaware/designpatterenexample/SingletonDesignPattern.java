package com.hexaware.designpatterenexample;
/*
 * Following code explains about Singleton Design Pattern using 
 * Eager Initialization.
 * */

public class SingletonDesignPattern {
	/**
	 * Variable to store the instance of singleton class
	 * */
	
	private static final SingletonDesignPattern instance = new SingletonDesignPattern();
	
	// private constructor to restrict object creation to single object
	
	private SingletonDesignPattern() {
		
	}
	
	// write a static method to retuern instance of the class
	
	public static SingletonDesignPattern getInstance() {
		return instance;
	}
	

}
