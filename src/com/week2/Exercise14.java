package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise14 {

	public static void main(String[] args) throws IOException {
		// 1에서 50까지의 구구단 출력기 만들기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int iNum = 0;
		int answer;
		char replay;

		while (true) {

			do {
				System.out.print("구구단 몇 단을 출력할까요?");
				iNum = Integer.parseInt(br.readLine());
			} while (iNum < 1 || iNum > 50);

			for (int i = 1; i <= 9; i++) {
				answer = iNum * i;
				System.out.printf("%d * %d = %d\n", iNum, i, answer);
			}

			System.out.print("다시해보시겠어요? (O/X)");
			replay = (char) System.in.read();

			if (replay != 'o' && replay != 'O') {
				System.out.println("다음에 또 만나요 ");
				break;
			}

			System.in.skip(5);
		}
	}

}
