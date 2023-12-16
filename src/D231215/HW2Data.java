package D231215;

public class HW2Data {
    private final double costWine;
    private final double costMilk;
    private double givenAmount;
    private double amount;
    private int age;

    public HW2Data (){
        this.costMilk = 1.19;
        this.costWine = 8.99;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setGivenAmount(double givenAmount) {
        this.givenAmount = givenAmount;
    }
    public void ageVerification(){
        if (age >= 18){
            this.amount = this.costWine + this.costMilk;
            System.out.println("Please pay: " + String.format("%.2f", this.amount) + " €");
        }else{
            System.out.println("You are not at least 18 years old, removing wine from the shopping list.");
            this.amount = this.costMilk;
            System.out.println("Please pay: " + String.format("%.2f", this.amount) + " €");
        }
    }
    public void calculation(){
        double returnAmount;
        if(this.givenAmount >= this.amount){
            returnAmount = this.givenAmount - this.amount;
            System.out.println("Thank you for your purchase, returning "
                    + String.format("%.2f", returnAmount) + " €");
        }
        else {
            returnAmount = this.givenAmount - this.amount;
            System.out.println("Insufficient amount given, missing "
                    + String.format("%.2f", (-1 * returnAmount)) + " €");
        }
    }
}
