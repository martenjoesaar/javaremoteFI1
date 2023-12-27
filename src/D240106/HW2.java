package D240106;

import java.util.ArrayList;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Double> fuelAmountList = new ArrayList<>();
        double fuelAmount;
        ArrayList <Double> fuelCostList = new ArrayList<>();
        double fuelPrice = 0;

        System.out.println("Enter one of the following fuel types or 'cancel' to cancel fuelling: \n" +
                "'gasoline' = 1.619€/l\n" + "'diesel' = 1.519€/l\n" + "'LPG' = 0.675€/l\n" +
                "Enter the fuel type: ");
        String fueltype = scanner.nextLine();

        while (!fueltype.equalsIgnoreCase("cancel")){
            if (fueltype.equals("diesel")){
                fuelPrice = 1.519;
                System.out.println("Selected fuel: diesel = 1.519 €/l");
            break;}
            else if (fueltype.equals("gasoline")){
                fuelPrice = 1.619;
                System.out.println("Selected fuel: gasoline = 1.619 €/l");
                break;}
            else if (fueltype.equals("lpg")){
                fuelPrice = 0.675;
                System.out.println("Selected fuel: LPG = 0.675 €/l");
                break;}
            else System.out.println("Invalid input. Try again: ");

            fueltype = scanner.nextLine();

        }

        String input;
        if (fueltype.equalsIgnoreCase("cancel")){
            input = "finish";
        } else{
            System.out.println(); //New line to start next function in console more clearly.
            System.out.println("Type 'continue' to start fuelling or 'finish' to cancel fuelling: ");
            input = scanner.nextLine();
        }


        while(!input.equalsIgnoreCase("finish")){
            System.out.println("Enter the fuel amount (in litres): ");
            fuelAmount = scanner.nextDouble();
            scanner.nextLine();

            fuelAmountList.add(fuelAmount);
            double fuelCost = fuelAmount * fuelPrice;
            fuelCostList.add(fuelCost);

            System.out.println("Fuelling: " + "\nAmount: " + String.format("%.2f",fuelAmount) + " litres\n"
                    + "Cost: " + String.format("%.2f",fuelCost) + "€");

            System.out.println("Type 'go' to add more fuel or 'finish' to stop: ");
            input = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Fuel amounts and costs: ");
        for (int i = 0; i < fuelAmountList.size(); i++) {
            String formattedAmount = String.format("%.3f", fuelAmountList.get(i));
            String formattedCost = String.format("%.3f", fuelCostList.get(i));
            System.out.println("Fuel amount " + (i + 1) + ": " + formattedAmount +
                    " litres - Fuel cost: " + formattedCost + "€");
        }

        double finalFuelCost = fuelCostList.stream().reduce(0.0, Double::sum);
        System.out.printf("Total fuel cost: %.2f€\n", finalFuelCost);

        System.out.println("Enter the paid amount: ");
        double givenAmount = scanner.nextDouble();
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
                returnAmount = returnAmount + extraAmount;
                if(returnAmount > 0){
                    System.out.println("Thank you for your purchase, returning "
                            + String.format("%.2f", returnAmount) + " €");
                }
            }
        }
    }
}
