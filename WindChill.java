package practiseProblemsDay5;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		double temp, velocity, windchill;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temperature :");
		temp = sc.nextDouble();

		for (;temp > 50;) {
			System.out.println("enter the temperature below 50");
			break;
		}

		System.out.println("Enter the velocity of wind speed between (3km to 120km) / hr");
		velocity = sc.nextDouble();
		
		for (; velocity <= 3;) {
			for (; velocity >= 120;)
			System.out.println("Re Enter the velocity");
			break;
		}

		windchill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(velocity, 0.16);

		System.out.println("Wind chill is : " + Math.pow(velocity, windchill));
	}

}
