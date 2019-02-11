package com.java.inheritance;

public class MountainBike extends Cycle {
	
	private int seatHight;
	public MountainBike(int gear, int speed,  int seatHeight) {
		super(gear, speed);
		this.seatHight = seatHeight;
	}
	
	public void setSeatHeight(int newValue) {
		seatHight = newValue;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ 
                "\nseat height is "+seatHight); 
	}
	
	public static void  main(String[] args) {
		MountainBike bike = new MountainBike(3, 100, 25);
		System.out.println(bike.toString());
	}
}
