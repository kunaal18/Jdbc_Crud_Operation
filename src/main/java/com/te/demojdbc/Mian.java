package com.te.demojdbc;

import java.util.Arrays;

public class Mian {
	public static void main(String[] args) {
		int ar[] = { 0, 1, 1, 0, 0, 1 };
		int temp = ar[0];
		ar[0] = ar[ar.length - 1];
		ar[ar.length - 1] = temp;

		System.out.println(Arrays.toString(ar));

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i]);
//		}

	}
}
