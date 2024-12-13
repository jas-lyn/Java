package BMIChallenge;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input! Weight and height must be greater than zero.");
        } else {
            // Calculate Body Mass Index (BMI)
            double bmi = weight / (height * height);

            System.out.printf("Your BMI is: %.2f\n", bmi);

            // Evaluate BMI
            if (bmi < 18.5) {
                System.out.println("You are underweight. Your body-to-weight ratio could be better.");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("You have a healthy body-to-weight ratio!");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("You are overweight. Your body-to-weight ratio could be better.");
            } else {
                System.out.println("You are obese. Your body-to-weight ratio needs improvement.");
            }
        }

        scanner.close();
    }
}

