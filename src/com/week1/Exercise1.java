package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) throws IOException{
		
		//�������� �Է¹޾� ���� ���ǿ� �ѳ��� ���ϱ�
		//�������� 3.1416���� final ���� ���
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//�Է¹��� �������� r, �������� ��� Pi�� ����
		double r;
		final double Pi = 3.1416;
		
		System.out.print("�������� �Է����ּ���");
		r = Double.parseDouble(br.readLine()); //�Է¹��� �������� 
		System.out.println();
		
		//������ ���� ����
		double area = 4 * Pi * r * r;
		double volume = (4/3.0) * Pi * r * r * r;
		
		//���
		System.out.println("�ѳ��̴� " + area + "�Դϴ�");
		System.out.println("���Ǵ� " + volume + "�Դϴ�");
		System.out.println();
		
		
		//�� ���ο��� ���� �� ���
		System.out.println("�ѳ��̴� " + (4 * Pi * r * r));
		System.out.println("���Ǵ� " + ((4/3.0) * Pi * r * r *r));

	}

}
