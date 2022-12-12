package practiseProblemsDay5;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num = num / i;
				System.out.println("The Prime Factors are :" + i);
			}
		}
	}
}
