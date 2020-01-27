package com.sample.scott;

public class Application {

	static int val = 0;
	static int sum = 2;
	static int max = 4000000;

	public static int fibonacci() {

		int a = 1;
		int b = 2;
		
		while (b <= max) {
			
			val = a + b;

			if (val % 2 == 0)
				sum = sum + val;

			a = b;
			b = val;
			System.out.println("Summing: " + sum);
		}
		return sum;
	}

	//Find the sum of all even numbers in the fibonacci seq from 1-4000000
	public static void main(String[] args) {

		int ans = fibonacci();
		System.out.println("Answer is: " + ans);
	}

}
