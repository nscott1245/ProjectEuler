package com.sample.scott;

public class Main {

	static int sum = 0;
	static int sum2 = 0;

	public static void main(String[] args) {

		int ans = squaredSum(100);
		
		int ans2 = sumSquared(100);
		ans2=ans2*ans2;
		System.out.println("ans = " + ans);
		System.out.println("ans2 = " + ans2);
		
		System.out.println("diff = " + (ans2-ans));
	}

	private static int squaredSum(int val) {

		if (val < 1) {
			return sum;
		} else {

			sum = sum + (val * val);
			System.out.println(sum);
			return squaredSum(val - 1);
		}
	}
	
	private static int sumSquared(int val) {

		if (val < 1) {
			return sum2;
		} else {

			sum2 = sum2 + val;
			System.out.println(sum2);
			return sumSquared(val - 1);
		}
	}
}
