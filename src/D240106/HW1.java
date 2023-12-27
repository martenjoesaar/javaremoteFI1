package D240106;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Poem1: ");
        System.out.println("Enter the authors surname: ");
        String surname1 = scanner.nextLine();

        System.out.println("Enter the authors nationality: ");
        String nationality1 = scanner.nextLine();

        System.out.println("Enter the numbers of strophes in poem: ");
        int stropheNumbers1 = scanner.nextInt();
        scanner.nextLine();

        HW1Author author1 = new HW1Author(surname1, nationality1);
        HW1Poem poem1 = new HW1Poem(author1, stropheNumbers1);

        System.out.println();
        System.out.println("Poem2: ");
        System.out.println("Enter the authors surname: ");
        String surname2 = scanner.nextLine();

        System.out.println("Enter the authors nationality: ");
        String nationality2 = scanner.nextLine();

        System.out.println("Enter the numbers of strophes in poem: ");
        int stropheNumbers2 = scanner.nextInt();
        scanner.nextLine();

        HW1Author author2 = new HW1Author(surname2, nationality2);
        HW1Poem poem2 = new HW1Poem(author2, stropheNumbers2);

        System.out.println();
        System.out.println("Poem3: ");
        System.out.println("Enter the authors surname: ");
        String surname3 = scanner.nextLine();

        System.out.println("Enter the authors nationality: ");
        String nationality3 = scanner.nextLine();

        System.out.println("Enter the numbers of strophes in poem: ");
        int stropheNumbers3 = scanner.nextInt();
        scanner.nextLine();

        HW1Author author3 = new HW1Author(surname3, nationality3);
        HW1Poem poem3 = new HW1Poem(author3, stropheNumbers3);

        HW1Poem[] poems = {poem1,poem2,poem3};
        HW1Author bestAuthor = getBestAuthor(poems);
        System.out.println();
        System.out.printf("%s has written the longest poem!", bestAuthor.getSurname());
    }
    private static HW1Author getBestAuthor(HW1Poem[] poems){
        int counter = 0;

        for(int i = 0; i < poems.length; i++){
            if(poems[counter].getStropheNumbers() < poems[i].getStropheNumbers());
            counter = i;
        }
        return poems[counter].getCreator();
    }
}