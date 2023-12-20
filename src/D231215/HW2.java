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
/*
Write a simple application that will simulate a shopping. Use only if-else flow control. Consider following cases:
If you would like to buy a bottle of milk – cashier will ask you for a specific amount of money. You have to enter that value and verify if it is same as the cashier asked.
If you would like to buy a bottle of wine – cashier will ask you if you are an adult and for positive answer ask for a specific amount of money.
 */