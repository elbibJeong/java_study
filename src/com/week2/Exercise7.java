package com.week2;

import java.io.IOException;

public class Exercise7 {

	public static void main(String[] args) throws IOException {

		char vet;
		char change;

		while (true) {
			
			System.in.skip(100);
			
			System.out.print("��-�ҹ��ڸ� ġȯ�� ���ĺ� �ϳ��� �������");
			
			vet = (char) System.in.read();

			change = vet >= 'A' && vet <= 'Z' ? (char) (vet + 32)
					: (vet >= 'a' && vet <= 'z' ? (char) (vet - 32) : vet);

			System.out.printf("%c > %c\n", vet, change);
			
			if(change == vet) {
				System.out.println("��-�ҹ��� ġȯ�� �����Ͽ����ϴ�. ġȯ�⸦ �����մϴ�");
				break;
			}
			
			System.in.skip(100);
			
			System.out.println(" ");
			System.out.println("�ٽ� �ұ��? (Y/N)");
			char replay = (char) System.in.read();

			if (replay != 'y' && replay != 'Y') {
				System.out.println("ġȯ�⸦ �����մϴ�");
				break;
			}

		}

	}
}