package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

	public static void main(String[] args) throws IOException {

		// �� ���� ������ �Է� �޾� ū ���� ���� ���ڸ� �����ؼ� ����ϱ� (if�� ���)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ù ��° ������ �Է����ּ��� : ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("�� ��° ������ �Է����ּ��� : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			System.out.printf("ū ���� : %d, ���� ���� : %d\n", a, b);
		} else {
			System.out.printf("ū ���� : %d, ���� ���� : %d\n", b, a);
		}

		// �� ���� ������ �Է� �޾� ū ���� ���� ���ڸ� �����ؼ� ����ϱ� (���׿����� ���)

		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ù ��° ������ �Է����ּ��� : ");
		int c = Integer.parseInt(cr.readLine());

		System.out.println("�� ��° ������ �Է����ּ��� : ");
		int d = Integer.parseInt(cr.readLine());

		String tof = c > d ? "ū ���� :" + c + ", ���� ���� : " + d : "ū ���� :" + d + ", ���� ���� : " + c;

		System.out.println(tof);

	}
}
