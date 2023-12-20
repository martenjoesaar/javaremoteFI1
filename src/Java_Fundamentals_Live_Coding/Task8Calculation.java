package Java_Fundamentals_Live_Coding;

public class Task8Calculation {    private float number1;
    private float number2;
    private char operator;

    public Task8Calculation(float number1, float number2, char operator){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public void calculation(){

        float result = 0;

        switch (this.operator) {

            case '+':
                result = this.number1 + this.number2;
                break;

            case '-':
                result = this.number1 - this.number2;
                break;

            case '*':
                result = this.number1 * this.number2;
                break;

            case '/':
                if (this.number2 != 0)
                    result = this.number1 / this.number2;
                else
                    System.out.println("Cannot calculate.");
                break;

            default: System.out.println("Invalid symbol.");
        }

        if (this.number2 != 0)
            System.out.println(" "+ this.number1 + " " + this.operator + " " + this.number2 + " = " + result);
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