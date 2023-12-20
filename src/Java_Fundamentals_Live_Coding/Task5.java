package Java_Fundamentals_Live_Coding;

import java.util.Scanner;

public class Task5 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give me a number: ");
    int number = scanner.nextInt();
    int count;

    for (int i = 2; i <= number; i++) {
        count = 0;

        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime number: " + i);
        }
    }
}
}