package Java_Fundamentals_Live_Coding;

import java.util.Scanner;

public class Task11 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give String or type enough! to finish");
    String input = scanner.nextLine();
    String longest = "0";
    while (!input.equalsIgnoreCase("enough!")) {
        if (input.length() > longest.length())
            longest = input;
        System.out.println("Give String or type enough! to finish");
        input = scanner.nextLine();
    }

    if (longest.equalsIgnoreCase("0")){
        System.out.println("No text provided");
    }
    else
        System.out.println("The longest text so far was: " + longest);



}
}