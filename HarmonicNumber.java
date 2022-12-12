package practiseProblemsDay5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		double num;
		double sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = sc.nextDouble();

		for (double i = 1; i <= num; i++) {
			sum = sum + (1 / i);

		}
		System.out.println("The harmonic series is: " + sum);

	}

}
