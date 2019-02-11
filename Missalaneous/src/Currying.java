// Java Program to demonstrate Function Currying 

import java.util.function.Function; 

public class Currying { 
	public static void main(String args[]) 
	{ 

		// Using Java 8 Functions 
		// to create lambda expressions for functions 
		// and with this, applying Function Currying 

		// Curried Function for Adding u & v 
		Function<Integer, 
				Function<Integer, Integer> > 
			curryAdder = u -> v -> u + v; 
			
		Function<Integer, Function<Integer, Integer>>
		curryMulti  = u -> v -> u*v;

		// Calling the curried functions 

		// Calling Curried Function for Adding u & v 
		System.out.println("Substract 2, 3 :"
						+ curryAdder.apply(2).apply(3)); 

		System.out.println("MultiPlication :" 
						 + curryMulti.apply(2).apply(3));
		
		} 
} 
