package Java_Fundamentals_Live_Coding;

public class Task7Fibonacci {
    public void printFibonacciSeries (int input){
    System.out.printf("The fibonacci series of %d numbers: ", input);

    int secondToLast = 0,
            last = 1;

    System.out.println(secondToLast + " " + last + " ");

    for(int counter = 2; counter < input; counter++){
        int current = secondToLast + last;
        secondToLast = last;
        last = current;

        System.out.print(current + " ");

    }
}
}