package com.week4;

import java.util.Scanner;

public class WhichAlien {

	public static void main(String[] args) {
		// ���� 6778��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int antenna = sc.nextInt();
		int eyes = sc.nextInt();
		
		if(antenna>=3 && eyes<5) {
			System.out.println("TroyMartian");
		}
		if(antenna<7 && eyes>=2) {
			System.out.println("VladSaturnian");
		}
		if(antenna<3 && eyes<4) {
			System.out.println("GraemeMercurian");
		}

	}

}
