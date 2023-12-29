package D240106;

import java.util.Scanner;
import java.util.ArrayList;

public class HW2V2Payment {

    //Constructor for HW2V2Payment class
    public HW2V2Payment(){}

    //Step 3: Payment after fuelling with HW2V2Fuelling Arraylist getters
    public void payment(HW2V2Fuelling fuelling){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> fuelAmountList = fuelling.getFuelAmountList();
        ArrayList<Double> fuelCostList = fuelling.getFuelCostList();

        System.out.println();//New line to start next function in console more clearly.
        //For loop to display every fuelling separately.
        System.out.println("Fuel amounts and costs: ");
        for (int i = 0; i < fuelAmountList.size(); i++) {
            String formattedAmount = String.format("%.3f", fuelAmountList.get(i));
            String formattedCost = String.format("%.3f", fuelCostList.get(i));
            System.out.println("Fuel amount " + (i + 1) + ": " + formattedAmount +
                    " litres - Fuel cost: " + formattedCost + "€");
        }

        //Sum of elements in the fuelCostList to display final value for payment.
        double finalFuelCost = fuelCostList.stream().reduce(0.0, Double::sum);
        System.out.printf("Total fuel cost: %.2f€\n", finalFuelCost);

        System.out.println("Enter the paid amount: ");
        double givenAmount = scanner.nextDouble();

        /*If function to compare user entered value with the finalCost and either:
        - if the given value is the same or larger, surplus is returned to user
        - if the given value is less, ask for the remaining value in the while loop
        until the given value sum is larger than the final cost, where the surplus
        is returned to the user.
         */
        double returnAmount;
        if(givenAmount >= finalFuelCost){
            returnAmount = givenAmount - finalFuelCost;
            System.out.println("Thank you for your purchase, returning "
                    + String.format("%.2f", returnAmount) + " €");
        }
        else {
            returnAmount = givenAmount - finalFuelCost;
            System.out.println("Insufficient amount given, missing "
                    + String.format("%.2f", (-1 * returnAmount)) + " €");
            while(returnAmount < 0){
                System.out.println("Please provide " + String.format("%.2f", (-1 * returnAmount)) + "€");
                double extraAmount = scanner.nextDouble();
                returnAmount += extraAmount;
                if(returnAmount > 0){
                    System.out.println("Thank you for your purchase, returning "
                            + String.format("%.2f", returnAmount) + " €");
                }
            }
        }
    }
}