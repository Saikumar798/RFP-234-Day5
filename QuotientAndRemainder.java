package practiseProblemsDay5;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		int dividend, divisor, quotient, remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Dividend");
		dividend = sc.nextInt();
		
		System.out.println("Enter the Divisor");
		divisor = sc.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;

		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " +remainder);
	}

}
