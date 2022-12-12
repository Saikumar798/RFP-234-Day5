package practiseProblemsDay5;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter The Number : ");
		num = sc.nextInt();
		
		if ( num %2 == 0)
			System.out.println(num +" is an Even Number.");
		else 
			System.out.println(num +" is an Odd Number.");
		
		System.out.println(args[0]);
	}

}
