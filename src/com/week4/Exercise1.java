package com.week4;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {


		Calendar dday = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		int y, m, d, hu;

		do {
			System.out.print("몇 년?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("몇 월?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		do {
			System.out.print("몇 일?");
			d = sc.nextInt();
		} while (d < 1 || d > 31);
		
		do {
			System.out.print("몇 일 후 날짜를 계산할까요?");
			hu = sc.nextInt();
		} while (hu < 1);


		dday.set(y, m - 1, d);

		y = dday.get(Calendar.YEAR);
		m = dday.get(Calendar.MONTH) + 1;
		d = dday.get(Calendar.DATE);
		int w = dday.get(Calendar.DAY_OF_WEEK);

		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.println("만난 날 : " + y + "년-" + m + "월-" + d + "일 " + week[w - 1] + "요일");
		//System.out.println(w);
		
		// 추가
		dday.set(y, m - 1, d + hu);

		y = dday.get(Calendar.YEAR);
		m = dday.get(Calendar.MONTH) + 1;
		d = dday.get(Calendar.DATE);
		w = dday.get(Calendar.DAY_OF_WEEK);

		System.out.println(hu +"일 후 : " + y + "년-" + m + "월-" + d + "일 " + week[w - 1] + "요일");
		//System.out.println(w);

	}

}
