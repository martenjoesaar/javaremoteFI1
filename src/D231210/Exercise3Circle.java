package D231210;

public class Exercise3Circle {
    private double area;
    private double radius;

    /*public void calculateArea(){
        this.area = Math.PI * Math.pow((diameter/2), 2);
    }*/

    public Exercise3Circle (double diameter){
        this.radius = diameter / 2;
    }
    public void calculateArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void Display (){
        System.out.println("Area of a circle: " + this.area);
    }

}
/*
Write a program to calculate area of a circle with diameter as input, using parameterised constructor.
 */