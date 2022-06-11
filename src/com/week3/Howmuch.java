package com.week3;

import java.util.Scanner;

public class Howmuch {

	public static void main(String[] args) {
		
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		money = sc.nextInt();
		
		System.out.println((int)(money * 0.78));
		System.out.println((int)(money-(money * 0.2 * 0.22)));
		
		
	}

}
