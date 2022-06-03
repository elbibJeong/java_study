package com.week2;

import java.io.IOException;

public class Exercise7 {

	public static void main(String[] args) throws IOException {

		char vet;
		char change;

		while (true) {
			
			System.in.skip(100);
			
			System.out.print("대-소문자를 치환할 알파벳 하나를 적어보세요");
			
			vet = (char) System.in.read();

			change = vet >= 'A' && vet <= 'Z' ? (char) (vet + 32)
					: (vet >= 'a' && vet <= 'z' ? (char) (vet - 32) : vet);

			System.out.printf("%c > %c\n", vet, change);
			
			if(change == vet) {
				System.out.println("대-소문자 치환에 실패하였습니다. 치환기를 종료합니다");
				break;
			}
			
			System.in.skip(100);
			
			System.out.println(" ");
			System.out.println("다시 할까요? (Y/N)");
			char replay = (char) System.in.read();

			if (replay != 'y' && replay != 'Y') {
				System.out.println("치환기를 종료합니다");
				break;
			}

		}

	}
}