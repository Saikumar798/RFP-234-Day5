package practiseProblemsDay5;

import java.util.Scanner;

public class HeadsAndTails {

	public static void main(String[] args) {
		double headsCount = 0, tailsCount = 0;
		System.out.println("Please enter the number : ");

		Scanner sc = new Scanner(System.in);
		int flips = sc.nextInt();

		for (int i = 0; i < flips; i++) {
			double random = Math.random();
			if (random < 0.5)
				headsCount++;
			else
				tailsCount++;
		}

		System.out.println("Number of Heads :" + headsCount);
		System.out.println("Number of Tails :" + tailsCount);

		double headspercentage = headsCount / flips * 100;
		double tailspercentage = tailsCount / flips * 100;

		System.out.println("Percentage of Heads :" + headspercentage);
		System.out.println("Percentage of tails :" + tailspercentage);

	}

}
