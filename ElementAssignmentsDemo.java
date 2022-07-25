package com.basicsstrong.arrays;

public class ElementAssignmentsDemo {

	public static void main(String[] args) {
		//Primitive types
		int[] x = new int[3];
		x[0] = 'a';
		System.out.println(x[0]);
		
		byte b = 2;
		x[1]= b;
		
		//------------------
		//Objects
		Object[] objArray = new Object[5];
		objArray[0] = new Object();
		objArray[1] = new String();
		
		//-------------------------
		//Abstract class array
		Number[] numArray = new Number[3];
		numArray[0] = new Integer(1);
		numArray[1] = new Byte("2");
		
		//--------------------------------
		//Interface types
		Runnable[] r = new Runnable[5];
		r[0] = new Thread();
		System.out.println(r[1]);
		
	}

}
