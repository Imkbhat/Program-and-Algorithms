package com.java.enumEx;

public class EnumConstructorExampleOne {
	
	enum TrafficSignal {
			RED("STOP"),GREEN("GO"),YELLOW("GO SLOW");
	
	private String action; 
	
	public String getAction() {
		return this.action;
	}

	private TrafficSignal(String action) {
		this.action = action;
	}
}

	public static void main(String[] args) {
		
		TrafficSignal[] sigs = TrafficSignal.values();
		
		for(TrafficSignal signal : sigs)
			System.out.println(signal +" action:"+ signal.getAction());
	}

}
