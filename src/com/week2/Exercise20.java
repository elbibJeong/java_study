package com.week2;

import java.util.Random;

public class Exercise20 {

	public static void main(String[] args) {
		
		//�ֻ��� 2���� ������
		//�� �ֻ����� ���� 5�� �� ������ ����غ���

		int a, b;

		while (true) {
			Random rand = new Random();
			a = rand.nextInt(6) + 1;
			b = rand.nextInt(6) + 1;

			if ((a + b) == 5) {
				System.out.printf("(%d , %d)", a, b);
				break;
			} else {
				System.out.printf("(%d , %d)\n", a, b);
			}
		}
	}

}
