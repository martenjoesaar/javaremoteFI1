package D231210;

public class Exercise4FizzBuzz {
    public Exercise4FizzBuzz(int input){
        int i = 0;

        while (i <= input){
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println("Fizz Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
            i++;
        }
    }
}
