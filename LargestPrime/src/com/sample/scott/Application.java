package com.sample.scott;

import java.util.ArrayList;
import java.util.List;

public class Application {

	private static boolean isPrime(int val) {
		boolean bool = true;

		int split = val / 2;

		if (val == 0 || val == 1) {

		} else {

			for (int n = 2; n <= val; n++) {
				if (val % n == 0) {
					bool = false;
					break;
				}

			}
		}

		System.out.println(bool);

		return bool;
	}

	public static void main(String[] args) {
		int max = 13195;
		List<Integer> factors = new ArrayList<>();
		int j = 2;

		for (int i = j; i < max; i++) {

			if (max % i == 0) {
				int newMax = max / i;

				if (isPrime(i)) {
					factors.add(i);
				}

				if (isPrime(newMax)) {
					factors.add(newMax);
				}

				max = newMax;
			}
		}

		factors.stream().forEach(x -> System.out.println(x));

	}

}
