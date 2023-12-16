package D231210;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter the radius diameter: ");
        double diameter = scanner.nextDouble();*/

        Exercise3Circle circle = new Exercise3Circle(4);

        //circle.setDiameter(diameter);

        circle.calculateArea();
        circle.Display();
}
}
/*
Write a program to calculate area of a circle with diameter as input, using parameterised constructor.
 */