package com.vti.frontend;

import java.time.LocalDateTime;

public class TestingSytem_2_Exercise_2 {
	public static void main(String[] args) {
		System.out.println("====================== Exercise 2 ======================");

		System.out.println("Question 1");

		int q1numb = 5;
		System.out.printf("%,d", q1numb);

		System.out.println("..........................................");

		System.out.println("Question 2");

		int q2numb = 100000000;
		System.out.printf("%,d", q2numb);

		System.out.println("..........................................");

		System.out.println("Question 3");

		Double q3numb = 5.567098;
		System.out.printf("%,.4f", q3numb);

		System.out.println("..........................................");

		System.out.println("Question 4");

		String hotenhs = "Nguyễn Văn A";
		System.out.println("Tôi tên là \"" + hotenhs + "\" và tôi đang độc thân");

		System.out.println("..........................................");

		System.out.println("Question 5");

		System.out.println(LocalDateTime.now());
		System.out.println("=>");
		System.out.format("%1$td/%1$tm/%1$ty  %1$tH:%1$tM:%1$tS", LocalDateTime.now());

	}
}
