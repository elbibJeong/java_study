package com.week2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// 4���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����Ͽ� ����ϱ� (if�� ���)

		int first, second, third, fourth;
		// first�� ���� ���� ���ڸ� fourth�� ���� ū ���ڸ� ������ ����

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 4���� �Է����ּ��� : ");

		first = sc.nextInt();
		second = sc.nextInt();
		third = sc.nextInt();
		fourth = sc.nextInt();

		int temp;

		if (first > second) {
			temp = second;
			second = first;
			first = temp;
		}

		if (third > fourth) {
			temp = third;
			third = fourth;
			fourth = temp;
		}
		
		if (second > fourth) {
			temp = second;
			second = fourth;
			fourth = second;
		}
		
		if (first > third) {
			temp = first;
			first = third;
			third = temp;
		}

		System.out.printf("���� ū ���� %d, ���� ���� ���� %d", fourth, first);

	}

}
