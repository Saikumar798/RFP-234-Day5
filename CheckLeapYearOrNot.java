package practiseProblemsDay5;

import java.util.Scanner;

public class CheckLeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :");

		int year = sc.nextInt();
//		for (; year < 1000;) {
//			System.out.println("Re Enter The number");
//		break;

//		}
		if (year % 4 == 0) {
			System.out.println("This is a Leap Year");
			
		} else if (year % 100 == 0) {
			System.out.println("This is Not a Leap Year");
			
		} else if (year % 400 == 0) {
			System.out.println("This is a Leap Year");
			
		} else
			System.out.println("This is Not a Leap Year");
	}

}
