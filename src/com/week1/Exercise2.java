package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

	public static void main(String[] args) throws IOException{
		
		//�Է¹��� ���� �̸����� �λ��ϴ� ���α׷� �����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String firstName;
		String lastName;
		
		System.out.print("���� �Է����ּ���");
		firstName = br.readLine();
		
		System.out.print("�̸��� �Է����ּ���");
		lastName = br.readLine();
		
		System.out.println();
		
		System.out.println("�ȳ��ϼ���.");
		System.out.println(firstName + " " + lastName + "��!");
		
		
	}

}
