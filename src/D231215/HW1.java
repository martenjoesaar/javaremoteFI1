package D231215;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        float number2 = scanner.nextFloat();

        HW1Calculation calculation = new HW1Calculation(number1, number2, operator);

        calculation.calculation();
    }
}
/*
Write an application that implements a simple calculator. The application should:
a. read first number (type float)
b. read one of the following symbols: +-/*
c. read second number (type float)
d. return a result of given mathematical operation
If the user provides other symbol than supported, the application should print "Invalid
symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
principles of mathematics), the application should print "Cannot calculate".
 */