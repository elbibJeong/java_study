package com.week2;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//�Է¹��� ������ ������ ǥ���ϱ� 
		
		double iNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���");
		iNum = sc.nextDouble();
		
		if(iNum > 0) {
			System.out.println(iNum + "�� ���� : " + iNum);
		} else if(iNum < 0) {
			System.out.println(iNum + "�� ���� : " + (-iNum));
		} else {
			System.out.println("0�Դϴ�.");
		}
	}
}
