package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

	public static void main(String[] args) throws IOException {

		// 두 개의 정수를 입력 받아 큰 수와 작은 숫자를 구분해서 출력하기 (if문 사용)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("첫 번째 정수를 입력해주세요 : ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("두 번째 정수를 입력해주세요 : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			System.out.printf("큰 숫자 : %d, 작은 숫자 : %d\n", a, b);
		} else {
			System.out.printf("큰 숫자 : %d, 작은 숫자 : %d\n", b, a);
		}

		// 두 개의 정수를 입력 받아 큰 수와 작은 숫자를 구분해서 출력하기 (삼항연산자 사용)

		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("첫 번째 정수를 입력해주세요 : ");
		int c = Integer.parseInt(cr.readLine());

		System.out.println("두 번째 정수를 입력해주세요 : ");
		int d = Integer.parseInt(cr.readLine());

		String tof = c > d ? "큰 숫자 :" + c + ", 작은 숫자 : " + d : "큰 숫자 :" + d + ", 작은 숫자 : " + c;

		System.out.println(tof);

	}
}
