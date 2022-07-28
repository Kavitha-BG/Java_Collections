package com.basicsstrong.lambda;

public class DoubleColonMethodReference {

	public static void main(String[] args) {
		MyFunInterfaceNew funInter = () -> System.out.println("I am Lambda");
		funInter.method1();
	}
	//static
	public static void method2() {
		System.out.println("I am not a Lambda");
	}
	//instance
	public void method3() {
		System.out.println("i am here, refer to me");
	}
}

interface MyFunInterfaceNew{
	public void method1();
}

class NewCallerClass{
	public static void main(String[] args) {
		MyFunInterfaceNew i = DoubleColonMethodReference :: method2;
		i.method1();
		
		DoubleColonMethodReference obj = new DoubleColonMethodReference();
		MyFunInterfaceNew i1 = obj :: method3;
		i1.method1();
	}
}
