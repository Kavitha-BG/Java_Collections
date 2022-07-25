package com.basicsstrong.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//List alist = new ArrayList();
		
		ArrayList aList = new ArrayList(30);
		
		//ArrayList aList1 = new ArrayList(Collection c);
		al.add("John");
		al.add(true);
		al.add(10);
		System.out.println(al);
		
		al.remove(new Integer(10));
		System.out.println(al);
		
		//boolean b= al.get(1);
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(al.get(1));
	}

}
