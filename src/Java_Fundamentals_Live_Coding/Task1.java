package Java_Fundamentals_Live_Coding;

import D231210.Exercise1Perimeter;

public class Task1 {
    public static void main(String[] args) {

        Task1Perimeter perimeter = new Task1Perimeter();

        double resultPerimeter = perimeter.calculatePerimeter(6.234f);

        System.out.println("Perimeter of a radius: " + resultPerimeter);
        System.out.printf("Perimeter: %f", resultPerimeter);

    }
}
/*
Write an application that will read diameter of a circle (variable of type float) and
calculate perimeter of given circle.
Firstly, assume π = 3.14. Later, use value of π from built-in Math class
 */