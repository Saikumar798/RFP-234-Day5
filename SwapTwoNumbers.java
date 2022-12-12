package practiseProblemsDay5;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		num1 = sc.nextInt();

		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();

		System.out.println(" Before swapping : ");
		System.out.println("First number = " + num1);
		System.out.println("Second number = " + num2);

		num = num1;
		num1 = num2;
		num2 = num;

		System.out.println(" After swapping : ");
		System.out.println("First number = " + num1);
		System.out.println("Second number = " + num2);

	}

}
