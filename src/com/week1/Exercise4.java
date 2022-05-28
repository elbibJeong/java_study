package com.week1;

public class Exercise4 {

	public static void main(String[] args) {

		// for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구하여 (x, y)의 형태로 출력하기
		// 단 x와 y는 10보다 작거나 같은 자연수이다.

		for (int x = 0; x < 11; x++) { //x가 0에서 시작하여 중괄호 안의 내용을 실행하고 x++
			for (int y = 0; y < 11; y++) { //y가 0에서 시작하여 중괄호 안의 내용을 실행하고 y++
				if ((4 * x) + (5 * y) == 60) { // 실행되는 중 4x + 5y = 60이 성립될 경우
					System.out.printf("(%d, %d)\n", x, y); //(x, y)의 형식으로 출력
				}
			}
		}

	}

}