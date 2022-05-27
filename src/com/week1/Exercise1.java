package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) throws IOException{
		
		//반지름을 입력받아 구의 부피와 겉넓이 구하기
		//원주율은 3.1416으로 final 변수 사용
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//입력받을 반지름은 r, 원주율은 상수 Pi로 설정
		double r;
		final double Pi = 3.1416;
		
		System.out.print("반지름을 입력해주세요");
		r = Double.parseDouble(br.readLine()); //입력받은 반지름을 
		System.out.println();
		
		//변수에 연산 대입
		double area = 4 * Pi * r * r;
		double volume = (4/3.0) * Pi * r * r * r;
		
		//출력
		System.out.println("겉넓이는 " + area + "입니다");
		System.out.println("부피는 " + volume + "입니다");
		System.out.println();
		
		
		//한 라인에서 연산 및 출력
		System.out.println("겉넓이는 " + (4 * Pi * r * r));
		System.out.println("부피는 " + ((4/3.0) * Pi * r * r *r));

	}

}
