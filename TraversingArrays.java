package com.basicsstrong.arrays;

public class TraversingArrays {

	public static void main(String[] args) {
		int[] a= new int[5];
		
		for(int ele: a) {
			System.out.println(ele);
		}
		
		int len = a.length;
		
		for(int i=0;i < len; i++) {
			a[i] = i+1;
			System.out.println("Element at index "+i+" is: "+a[i]);
		}
		
		//-----------------------
		
		int[][] b=new int[2][3];
		for(int[] arr: b) {
			for(int ele: arr) {
				System.out.println(ele);
			}
		}
		
		for (int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		
	}

}
