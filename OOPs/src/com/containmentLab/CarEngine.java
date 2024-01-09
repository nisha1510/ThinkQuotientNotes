package com.containmentLab;

public class CarEngine {
	
	private String type;
	
	CarEngine(){
		
	}

	public CarEngine(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "CarEngine [type=" + type + "]";
	}
	
}
