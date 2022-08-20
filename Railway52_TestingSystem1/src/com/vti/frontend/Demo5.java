package com.vti.frontend;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("đây là số 1");
			break;
		case 2:
			System.out.println("đây là số 2");
		default:
			System.out.println("đây là số " + b);
			break;
		}
	}
}
