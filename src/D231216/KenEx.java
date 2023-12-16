package D231216;

import java.util.Scanner;

public class KenEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        if (number1 < 30 && number2 < 30) {
            System.out.println("input lower");
        } else if (number1 > 30 && number2 > 30) {
            System.out.println("input greater");
        } else if (number1 == 30 && number2 == 30) {
            System.out.println("equals");
        } else {
            System.out.println("<>");
        }
    }
}
/*
As above but compare two values at the same time.
Show if both values are greater, equal or lower than 30.
 Otherwise show "<>".  Example:
  input: 22, 25 output: lower
   input: 30, 30 output: equal
    input: 32, 33 output: greater
     input: 22, 32 output: <>
      input: 32, 22 output: <>
 */