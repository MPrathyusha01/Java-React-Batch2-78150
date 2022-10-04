package com.hexaware.designpatterenexample.factorydesignpattern;

public class Server implements Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}

	
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	
}