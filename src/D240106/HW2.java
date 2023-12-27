package D240106;

import java.util.ArrayList;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Double> fuelAmountList = new ArrayList<>();
        double fuelAmount;
        ArrayList <Double> fuelCostList = new ArrayList<>();
        double fuelPrice = 1.620;

        System.out.println("Type 'continue' to start fuelling or 'finish' to cancel fuelling: ");
        String input = scanner.nextLine();

        while(!input.equalsIgnoreCase("finish")){
            System.out.println("Enter the fuel amount (in litres): ");
            fuelAmount = scanner. nextDouble();
            scanner.nextLine();

            fuelAmountList.add(fuelAmount);
            double fuelCost = fuelAmount * fuelPrice;
            fuelCostList.add(fuelCost);

            System.out.println("Type 'continue' to add more fuel or 'finish' to stop: ");
            input = scanner.nextLine();
        }

        System.out.println("Fuel amounts and costs: ");
        for (int i = 0; i < fuelAmountList.size(); i++) {
            String formattedAmount = String.format("%.3f", fuelAmountList.get(i));
            String formattedCost = String.format("%.3f", fuelCostList.get(i));
            System.out.println("Fuel amount " + (i + 1) + ": " + formattedAmount +
                    " litres - Fuel cost: " + formattedCost);
        }

        double finalFuelCost = fuelCostList.stream().reduce(0.0, Double::sum);
        System.out.printf("Total fuel cost: %.2f\n", finalFuelCost);
    }
}
