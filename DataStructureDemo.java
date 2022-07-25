package com.basicsstrong.generics;

import java.util.ArrayList;

public class DataStructureDemo {

	public static void main(String[] args) {
		String[] strArray = new String[20];
		Employee[] empArray = new Employee[20];
		strArray[0] = "Meenal";
		//strArray[1] = new Employee();
		
		ArrayList l = new ArrayList();
		//int  --> Integer
		l.add("Meenal");
		l.add(new Employee());
		Employee name = (Employee) l.get(0);
		
	}

}
