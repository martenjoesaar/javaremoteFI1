package D231210;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        Exercise4FizzBuzz fizzBuzz = new Exercise4FizzBuzz(input);
    }
}
