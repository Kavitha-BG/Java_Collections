package com.basicsstrong.lambda;

interface MyFunInterface2{
	public int findLength(String s);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		MyFunInterface2 i = s -> s.length();
		int len =i.findLength("Lambda");
		System.out.println("length of the given string is: "+len);
		
	}

}
