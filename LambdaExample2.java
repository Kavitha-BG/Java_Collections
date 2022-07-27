package com.basicsstrong.lambda;

interface MyFunInterface{
	public void funMethodAdd(int a, int b);
}

//class CallFunInterface implements MyFunInterface{
//	
//	@Override
//	public void funMethodAdd(int a, int b) {
//		System.out.println(" Sum of a and b is: "+ (a+b));
//	}
//	
//}



public class LambdaExample2 {

	public static void main(String[] args) {
//		MyFunInterface funInter = new CallFunInterface();
//		funInter.funMethodAdd(10, 20);
		
		MyFunInterface funInter = (a,b) -> System.out.println("The sum of a and b is: "+(a+b));
		funInter.funMethodAdd(10,20);
		
	}

}
