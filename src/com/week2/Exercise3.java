package com.week2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// 4개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분하여 출력하기 (if문 사용)

		int first, second, third, fourth;
		// first에 가장 작은 숫자를 fourth에 가장 큰 숫자를 대입할 예정

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 4개를 입력해주세요 : ");

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

		System.out.printf("제일 큰 숫자 %d, 제일 작은 숫자 %d", fourth, first);

	}

}
