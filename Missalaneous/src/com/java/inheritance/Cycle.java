package com.java.inheritance;

public class Cycle {
	
	private int speed;
	private int gear;
	
	public Cycle(int gear, int speed) {
		this.speed = speed;
		this.gear = gear;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed +=increment;
	}

	@Override
	public String toString() {
		return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}

