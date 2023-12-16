package D231215;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HW2Data data = new HW2Data();

        System.out.println("Shopping list: milk and wine.");

        System.out.println("Wine is for 18+ age. Please provide your age: ");
        int age = scanner.nextInt();

        data.setAge(age);

        data.ageVerification();

        System.out.println("Enter your given amount: ");
        double givenAmount = scanner.nextDouble();

        data.setGivenAmount(givenAmount);

        data.calculation();


    }
}
