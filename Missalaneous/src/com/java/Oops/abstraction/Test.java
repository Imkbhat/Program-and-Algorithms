package com.java.Oops.abstraction;


public class Test {

	public static void main(String[] args) 
   { 
//        Shape s1 = new Circle("Red", 2.2); 
//        Shape s2 = new Rectangle("Yellow", 2, 4); 
//  throws NullPointerException       
//          
//        System.out.println(s1.toString()); 
//        System.out.println(s2.toString());
		/*try {
		Object s1 = null;
		String s1S = String.valueOf(s1);
		String s2  =  (String)s1;
		System.out.println(s1S +"===="+ s2);
		//s1.toString();
		} catch (NullPointerException ex){
			ex.printStackTrace();
		}*/
		
		
		//Flexible nature of Java.lang.Object
		Object y ;
		
		y = 'a';
		
		System.out.println(y.getClass().getName());
		y = 1;
		System.out.println(y.getClass().getName());

		y = "Hi";
		System.out.println(y.getClass().getName());
		
		y = 1.22;
		System.out.println(y.getClass().getName());
		
		y = false;
		System.out.println(y.getClass().getName());
		
		String  a = "Hi";
		String b = "Hi";
		
		a.equals(b);
		
    } 
	
}
