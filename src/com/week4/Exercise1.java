package com.week4;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {


		Calendar dday = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		int y, m, d, hu;

		do {
			System.out.print("�� ��?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("�� ��?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		do {
			System.out.print("�� ��?");
			d = sc.nextInt();
		} while (d < 1 || d > 31);
		
		do {
			System.out.print("�� �� �� ��¥�� ����ұ��?");
			hu = sc.nextInt();
		} while (hu < 1);


		dday.set(y, m - 1, d);

		y = dday.get(Calendar.YEAR);
		m = dday.get(Calendar.MONTH) + 1;
		d = dday.get(Calendar.DATE);
		int w = dday.get(Calendar.DAY_OF_WEEK);

		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.println("���� �� : " + y + "��-" + m + "��-" + d + "�� " + week[w - 1] + "����");
		//System.out.println(w);
		
		// �߰�
		dday.set(y, m - 1, d + hu);

		y = dday.get(Calendar.YEAR);
		m = dday.get(Calendar.MONTH) + 1;
		d = dday.get(Calendar.DATE);
		w = dday.get(Calendar.DAY_OF_WEEK);

		System.out.println(hu +"�� �� : " + y + "��-" + m + "��-" + d + "�� " + week[w - 1] + "����");
		//System.out.println(w);

	}

}
