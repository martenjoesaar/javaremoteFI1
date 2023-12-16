package D231216;

public class Task2Array {

    private static final int[] array = new int[10];

    public Task2Array() {}

    public void randomGenerator() {
        System.out.println("Generating the array random elements from 0 - 99.");
        for (int i = 0; i < array.length; i++) {
            int range = 100;
            array[i] = (int) (Math.random() * range);

            System.out.println("Element " + (i + 1) + " - " + array[i]);
        }
    }

    public static void evenElements() {

        System.out.println();
        System.out.println("Even element numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Element " + (i + 1) + " - " + array[i]);
            }
        }
    }
    public static void oddElements() {

        System.out.println();
        System.out.println("Odd element numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Element " + (i + 1) + " - " + array[i]);
            }
        }
    }
}
/*
Write a program that does the following(the code should be written in separate methods):
1.Generated an array with 10 elements random between 0 and 99. (See Random class in java).
2.Display the generated array.
3.Display only the odd numbers.
4.Display only the even numbers.
 */