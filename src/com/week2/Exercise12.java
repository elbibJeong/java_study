package com.week2;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//입력받은 숫자의 절댓값을 표시하기 
		
		double iNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요");
		iNum = sc.nextDouble();
		
		if(iNum > 0) {
			System.out.println(iNum + "의 절댓값 : " + iNum);
		} else if(iNum < 0) {
			System.out.println(iNum + "의 절댓값 : " + (-iNum));
		} else {
			System.out.println("0입니다.");
		}
	}
}
