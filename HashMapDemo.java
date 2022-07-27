package com.HashMap;

import java.util.HashMap;
//import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> marks = new HashMap<>();
		marks.put("Science", 90);
		marks.put("Maths", 80);
		marks.put("English", 90);
		marks.put("FB", 10);
		marks.put("Ea", 10);
		marks.put("Science", 10);
		
		System.out.println(marks.get("Ea"));
		
		System.out.println(marks.keySet());
		
		System.out.println(marks.entrySet());
		
		System.out.println(marks.values());
		
		System.out.println(marks.clone());
		
		System.out.println(marks.containsKey("Ea"));
		
		System.out.println(marks.remove("Ea",10));
		
		System.out.println(marks.computeIfAbsent("Hello",k->1));
		
		
		System.out.println(marks);
		
//		Map m = new HashMap();
//		HashMap map1 = new HashMap(20);
//		HashMap hmap = new HashMap(20, 0.9f);	
//		HashMap newMap = new HashMap(m);
		
		
	}

}
