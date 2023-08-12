package com.dsa;

public class SwapNumbersWithTempVar {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp = a;

		System.out.println("Before Swap");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = b;
		b = temp;

		System.out.println("After Swap");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
