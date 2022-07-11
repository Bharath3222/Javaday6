package org.bridge.git;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	static int[] arr;
	static Random rn = new Random();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of tokens do you need");
		int n = sc.nextInt();
		System.out.println("Generating(" + n + ")tokens");
		generateToken(n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void generateToken(int n) {
		arr = new int[n];
		for (int i = 0; i < n; i++) {

			int number = rn.nextInt(5);
			checkDuplicate(number, i);
			arr[i] = number;
		}
	}

	public static void checkDuplicate(int number, int i) {
		System.out.println("Checking duplicates");
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j; j2 < arr.length; j2++) {
				if(j==j2)
					continue;
				if (arr[j] == arr[j2]) {
					System.out.print("duplicate found, generate new token  ");
					int replacement = rn.nextInt(5);
					boolean duplicate = true;
					do {
						try {
							arr[j2] = replacement;
							for (int k = 0; k < j2; k++) {
								if (arr[j2] == arr[k])
									throw new Exception();
							}
							duplicate = false;
						} catch (Exception e) {
							System.out.println("Please genearte another token ");
							replacement = rn.nextInt(5);
						}
					} while (duplicate);
				}
			}

		}

	}

}
