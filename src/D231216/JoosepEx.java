package D231216;
import java.util.Arrays;

public class JoosepEx {
    public static void main(String[] args) {


        int[] intArray = new int[]{-5, -8, -2, 5, -8, -10, 19, 5, -38, 9};

        int poscount = 0, negcount = 0, length = intArray.length;

        int[] rearangeArray = new int[length];

        for (int i = 0; i < length ; i++) {
            if (intArray[i] < 0) {
                rearangeArray[(length-1) - negcount] = intArray[i];
                negcount++;
            } else {
                rearangeArray[poscount] = intArray[i];
                poscount++;

            }

        }

        System.out.println(Arrays.toString(rearangeArray));
    }
}
/*
Having an array with integer numbers rearrange the elements to have the positive numbers
on the left and the negative numbers on the right.
Do not use any sorting methods.
 */