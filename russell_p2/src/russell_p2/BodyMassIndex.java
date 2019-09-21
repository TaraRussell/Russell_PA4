package russell_p2;


import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scnr = new Scanner(System.in);

		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		String userInput;
		
		System.out.println("\n\nEnter \"standard\" or \"metric\" for preferred unit-of-measure:"); // equation option
		userInput = scnr.nextLine();
		
		
		double bmi;
		double weightInPounds = 0;
		double weightInKilos = 0;
		double heightInFeet = 0;
		double heightInInches = 0;
		double heightInCentimeters = 0;
		double heightInMeters = 0;
		
		
		if (userInput.equals("standard")) {
			
			System.out.println("Enter height");
			System.out.print("Feet: ");
			
				heightInFeet = scnr.nextDouble();
			
			System.out.print("Inches: ");
			
				heightInInches = scnr.nextDouble();
			
			System.out.print("Enter weight: ");
			
				weightInPounds = scnr.nextDouble();
			
			System.out.println("\n");
			
				heightInInches = (heightInFeet * 12) + heightInInches;
			
				bmi = (703 * weightInPounds) / (Math.pow(heightInInches,2.0));
			
			System.out.println("Your BMI is: " + bmi);
		
		}
		
		
		else if (userInput.equals("metric")) {
			
			System.out.print("Enter height: ");
			
				heightInCentimeters = scnr.nextDouble();
				
				heightInMeters = (heightInCentimeters * 100);
				
			System.out.print("Enter weight: ");
			
				weightInKilos = scnr.nextDouble();
				
			
			bmi = (weightInKilos) / (Math.pow(heightInMeters,2.0));
			
			System.out.println("\nYour BMI is: " + bmi);
		}
		
		
		else {
			
			System.out.print("Invalid entry");
				
		}

	}

}
