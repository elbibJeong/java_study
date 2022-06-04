package com.week2;

import java.util.Random;

public class Exercise20 {

	public static void main(String[] args) {
		
		//주사위 2개를 굴려서
		//두 주사위의 합이 5가 될 때까지 출력해보기

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
