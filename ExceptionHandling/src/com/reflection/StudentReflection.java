package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentReflection {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Class c1 = s1.getClass();
		
		System.out.println(c1.getName());
		
		Method[] m = c1.getDeclaredMethods();
		for (Method me : m)
			System.out.println(me);
		
		Field[] f = c1.getDeclaredFields();
		
		for (Field fi : f)
			System.out.println(fi);
		
		
		//Class loader
		System.out.println(Student.class.getClassLoader());
	}

}
