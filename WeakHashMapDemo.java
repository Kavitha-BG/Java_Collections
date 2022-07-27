package com.HashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "element");
		System.out.println(m);
		
		t = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
		
	}

}
