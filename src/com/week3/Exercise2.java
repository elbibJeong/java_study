package com.week3;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {

		int[] mixNum = new int[6];
		int temp;

		Random rd = new Random();
		System.out.print("Source Date :");
		for (int i = 0; i < mixNum.length; i++) {
			mixNum[i] = 100 + rd.nextInt(899);
			System.out.printf("%4d", mixNum[i]);
		}

		for (int i = 0; i < mixNum.length - 1; i++) {
			for (int j = i + 1; j < mixNum.length; j++) {
				if (mixNum[i] > mixNum[j]) {
					temp = mixNum[i];
					mixNum[i] = mixNum[j];
					mixNum[j] = temp;
				}
			}
		}
		System.out.println();
		for ( int su : mixNum) {
			System.out.printf("%4d", su);
		}

	}

}
