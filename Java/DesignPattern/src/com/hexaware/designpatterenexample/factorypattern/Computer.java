package com.hexaware.designpatterenexample.factorypattern;

public class Computer {
	
	// required parameter
	
	private String HDD;
	private String  RAM;
	
	private boolean isBluetooth;
	private boolean isGraphicscardEnabled;
	
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public boolean isGraphicscardEnabled() {
		return isGraphicscardEnabled;
	}
	public Computer(String hDD, String rAM, boolean isBluetooth, boolean isGraphicscardEnabled) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isBluetooth = isBluetooth;
		this.isGraphicscardEnabled = isGraphicscardEnabled;
	}
	
	// builder class
	public static class ComputerBuilder{
	private String HDD;
	private String  RAM;
	
	private boolean isBluetooth;
	private boolean isGraphicscardEnabled;
	public ComputerBuilder(String hDD, String rAM) {
		super();
		HDD = hDD;
		RAM = rAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public boolean isGraphicscardEnabled() {
		return isGraphicscardEnabled;
	}
	public ComputerBuilder(ComputerBuilder cb) {
		super();
		HDD = cb.HDD;
		RAM = cb.RAM;
		this.isBluetooth = cb. isBluetooth;
		this.isGraphicscardEnabled = cb.isGraphicscardEnabled;
	}
	
	
	
	
	
	}
	

}
