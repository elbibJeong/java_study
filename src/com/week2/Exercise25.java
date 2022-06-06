package com.week2;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {

		int year, month, yearday, yoil;
		Scanner sc = new Scanner(System.in);

		int[] monthday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		do {
			System.out.print("�� �� �Դϱ�?");
			year = sc.nextInt();
		} while (year <= 0);

		do {
			System.out.print("�� �� �Դϱ�?");
			month = sc.nextInt();
		} while (month <= 0 || month >= 13);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthday[1] = 29;
		}

		yearday = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		for (int i = 0; i < month - 1; i++) {
			yearday += monthday[i];
		}

		yearday += 1;

		yoil = yearday % 7;

		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		for (int i = 0; i < yoil; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= monthday[month - 1]; i++) {
			System.out.printf("%4d", i);
			yoil++;

			if (yoil % 7 == 0) {
				System.out.println();
			}
		}if (yoil % 7 != 0) {
			System.out.println();
		}
		System.out.println("------------------------------");
	}

}