package D231210;

public class Exercise1 {
    public static void main(String[] args) {

        Exercise1Perimeter perimeter = new Exercise1Perimeter();

        double resultPerimeter = perimeter.calculatePerimeter(6.234f);

        System.out.println("Perimeter of a radius: " + resultPerimeter);
        System.out.printf("Perimeter: %f", resultPerimeter);

    }
}