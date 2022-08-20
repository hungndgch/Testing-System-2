package com.vti.frontend;

import java.util.Scanner;

public class Demo_HelloVTI {
	public static void main(String[] args) {
		System.out.println("Hello VTI");
		// Tính tổng 2 số bất kỳ
		int a = 10;
		int b = 20;

		System.out.println("Tong 2 so = " + (a + b));
		Sum();
	}

	public static void Sum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		System.out.println(a + b);
	}

}
