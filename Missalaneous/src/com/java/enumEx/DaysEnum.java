package com.java.enumEx;



enum Day {
	SUNDAY, MONDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;
}

public class DaysEnum {

	Day day ;
	
	public DaysEnum(Day day) {
		this.day = day;
	}
	
	public void daysILike () {
		
		switch(day) {
		case MONDAY : 
			System.out.println("Good Day Monday");
			break;
		case TUESDAY:
			System.out.println("Good Day TUESDAY");
			break;
		case WEDNESDAY:
			System.out.println("Good Day WEDNESDAY");
			break;
		case THURSDAY:
			System.out.println("Good Day THURSDAY");
			break;
		case FRIDAY:
			System.out.println("Good Day FRIDAY");
			break;
		case SATURDAY:
			System.out.println("Good Day SATURDAY");
			break;
		}
	}

public static void main(String[] args) {
	String str = "TUESDAY";
	DaysEnum t1 = new DaysEnum(Day.valueOf(str));
	t1.daysILike();
	
	Day[] vals = Day.values();
	for (Day d1 : vals) {
		System.out.println(d1);
		System.out.println(d1.ordinal()); 
	}
	
	
	
}

}