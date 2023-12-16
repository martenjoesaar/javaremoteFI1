package D231216;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci series: \n Enter an Integer: ");
        int inputF = scanner.nextInt();

        Task1Fibonacci fibonacci = new Task1Fibonacci();
        fibonacci.printFibonacciSeries(inputF);


    }
}