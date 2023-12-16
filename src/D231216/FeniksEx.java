package D231216;

import java.util.Scanner;

public class FeniksEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'continue' to continue or 'quit' to exit: ");
            String input = scanner.nextLine();

            System.out.println("You entered: " + input);

            if (input.equalsIgnoreCase("quit")){
                System.out.println("Goodbye!");
                break;
            }
            else if (input.equalsIgnoreCase("continue")){
                System.out.println("Continuing...");
            }
            else {
                System.out.println("Error command.");
            }
        }
    }
}
/*
Write a simple "echo" application, that will:
print back entered string,
go to the beginning of a loop if user will enter "continue",
break the loop with a "goodbye!" message, if user will enter "quit".
*/
