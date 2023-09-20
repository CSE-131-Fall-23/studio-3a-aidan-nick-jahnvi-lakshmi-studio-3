package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Primes up to what number? ");
		int n = scan.nextInt();
		boolean[] prime = new boolean[n];

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (!prime[i]) {
				for (int j = i * i; j < n; j += i) {
					prime[j] = true;

				}

			}

		}
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {

				System.out.println("Prime " + i);
			}
		}

	}

}
