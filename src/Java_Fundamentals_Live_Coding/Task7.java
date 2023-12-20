package Java_Fundamentals_Live_Coding;

import D231216.Task1Fibonacci;

import java.util.Scanner;

public class Task7 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Fibonacci series: \n Enter an Integer: ");
    int inputF = scanner.nextInt();


    Task7Fibonacci fibonacci = new Task7Fibonacci();
    fibonacci.printFibonacciSeries(inputF);

}
}
/*
Write an application that will take a positive number from the user (type int) and
calculate the Fibonacci number at the indicated index. For example, if the number equals
5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
number is the sum of the two preceding ones. For example, the first few Fibonacci
numbers are:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
 */