package exercises;

import java.util.Scanner;

public class BmiCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weightPound = scanner.nextDouble();
		System.out.println("Enter height in feet and inches: ");
		System.out.println("Feet: " );
		double heightFeet = scanner.nextDouble();
		System.out.println("Inches: ");
		double heightInches = scanner.nextDouble();
		heightInches = (12 * heightFeet) + heightInches;
		
		//conversion Equations, from google:
		double weightKg = weightPound * 0.4535924;
		double heightMeters = heightInches * 0.0254;
		
		//BMI equation:
		double BMI = weightKg / (heightMeters * heightMeters);
		//round to one decimal:
		BMI = round(BMI, 1);
		System.out.println("Your BMI is : " + BMI);
		if(BMI < 18.5) {
			System.out.println(BMI + " indicates underweight.");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println(BMI + " indicates optimum.");
		} else if (BMI >= 30 && BMI<= 34.9) {
			System.out.println(BMI + " indicates Class I obesity.");
		} else if (BMI >= 35 && BMI <= 39.9 ) {
			System.out.println(BMI + " indicates Class II obesity.");
		} else if (BMI >=40) {
			System.out.println(BMI + " indicates Class III obesity.");
		}
		scanner.close();

	}
	
	//rounding function found on StackOverflow:
	private static double round(double value, int precision) {
		int scale = (int) Math.powExact(10, precision);
		return (double) Math.round(value*scale)/scale;
	}

}
