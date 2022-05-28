package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

	public static void main(String[] args) throws IOException{
		
		//입력받은 성과 이름으로 인사하는 프로그램 만들기
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String firstName;
		String lastName;
		
		System.out.print("성을 입력해주세요");
		firstName = br.readLine();
		
		System.out.print("이름을 입력해주세요");
		lastName = br.readLine();
		
		System.out.println();
		
		System.out.println("안녕하세요.");
		System.out.println(firstName + " " + lastName + "님!");
		
		
	}

}
