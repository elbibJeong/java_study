package com.week1;

public class Exercise4 {

	public static void main(String[] args) {

		// for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���Ͽ� (x, y)�� ���·� ����ϱ�
		// �� x�� y�� 10���� �۰ų� ���� �ڿ����̴�.

		for (int x = 0; x < 11; x++) { //x�� 0���� �����Ͽ� �߰�ȣ ���� ������ �����ϰ� x++
			for (int y = 0; y < 11; y++) { //y�� 0���� �����Ͽ� �߰�ȣ ���� ������ �����ϰ� y++
				if ((4 * x) + (5 * y) == 60) { // ����Ǵ� �� 4x + 5y = 60�� ������ ���
					System.out.printf("(%d, %d)\n", x, y); //(x, y)�� �������� ���
				}
			}
		}

	}

}