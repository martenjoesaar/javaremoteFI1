package Java_Fundamentals_Live_Coding;

import java.util.Scanner;

public class Task2 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight in kilograms: ");
    float weight = scanner.nextFloat();

    System.out.print("Enter your height in centimeters: ");
    int height = scanner.nextInt();

    float heightInCentimeters = height / 100.0f;
    float bmi = weight / (heightInCentimeters * heightInCentimeters);
    System.out.println(bmi);

    if (bmi >= 18.5 && bmi <= 24.9) {
        System.out.println("BMI optimal");
    } else {
        System.out.println("BMI not optimal");
    }

    scanner.close();
}
}