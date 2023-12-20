package D231217;

import java.util.Scanner;

public class Task2Explanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        int count;

        for (int i = 2; i <= number; i++) {
            System.out.println("Number checked: " + i);
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                System.out.println("j: " + j);
                System.out.println("Calculation: " + i + " % " + j + " == " + (i % j) );
                if (i % j == 0) {
                    count++;
                    System.out.println("Count: " + count);
                    System.out.println("Not a prime number.");
                    System.out.println();
                    break;
                }
                else System.out.println("-Count: " + count);
            }

            if (count == 0) {
                System.out.println("Prime number: " + i);
                System.out.println();
            }
        }
    }
}