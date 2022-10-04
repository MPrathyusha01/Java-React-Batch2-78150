package com.hexaware.designpatterenexample.factorydesignpattern;

public abstract class PC extends  Computer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	
	public String getram() {
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

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}


	
	}


	
	

}