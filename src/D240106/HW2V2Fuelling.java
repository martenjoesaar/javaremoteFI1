package D240106;

import java.util.ArrayList;
import java.util.Scanner;

public class HW2V2Fuelling {
    private double fuelPrice;
    private String fuelType;
    private ArrayList<Double> fuelAmountList = new ArrayList<>();
    private ArrayList<Double> fuelCostList = new ArrayList<>();

    //Constructor for HW2V2Fuelling class
    public HW2V2Fuelling(){}

    // Getter for fuelAmountList for HW2V2Payment class
    public ArrayList<Double> getFuelAmountList() {
        return fuelAmountList;
    }

    // Getter for fuelAmountList for HW2V2Payment class
    public ArrayList<Double> getFuelCostList() {
        return fuelCostList;
    }
    //Step 1: Getting the user to choose the fuel type
    public void fuelType (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the following fuel types or 'cancel' to cancel fuelling: \n" +
                "'gasoline' = 1.619€/l\n" + "'diesel' = 1.519€/l\n" + "'LPG' = 0.675€/l\n" +
                "Enter the fuel type: ");
        this.fuelType = scanner.nextLine();

        /*While loop for the user input, either fuel type with if statement or user input 'cancel'
          to exit the loop and exit the code to cancel the fuelling.
         */
        while (!this.fuelType.equalsIgnoreCase("cancel")){
            if (this.fuelType.equals("diesel")){
                this.fuelPrice = 1.519;
                System.out.println("Selected fuel: diesel = 1.519 €/l");
                break;}
            else if (this.fuelType.equals("gasoline")){
                this.fuelPrice = 1.619;
                System.out.println("Selected fuel: gasoline = 1.619 €/l");
                break;}
            else if (this.fuelType.equals("lpg")){
                this.fuelPrice = 0.675;
                System.out.println("Selected fuel: LPG = 0.675 €/l");
                break;}
            else System.out.println("Invalid input. Try again: ");

            //Second user input confirms fuelType value
            this.fuelType = scanner.nextLine();

        }

    }
    /*Step 2: Start fuelling with the option to add more fuel after the first input
    if user feels like it.
    */
    public void fuelling(){
        Scanner scanner = new Scanner(System.in);

        //This block uses Step1 function, if input is 'cancel' it will also implement 'finish'
        //to skip the fuelling as well as the fuelling is cancelled
        String input;
        if (this.fuelType.equalsIgnoreCase("cancel")){
            input = "finish";
        } else{
            System.out.println(); //New line to start next function in console more clearly.
            //Here is another chance for user to cancel fuelling
            System.out.println("Press ENTER to start fuelling or 'finish' to cancel fuelling: ");
            input = scanner.nextLine();
        }

        //This block handles user input, either 'finish' to finish fuelling or ENTER to add fuel
        //The while loop continues until the 'finish' command is entered.
        while(!input.equalsIgnoreCase("finish")){
            System.out.println("Enter the fuel amount (in litres): ");
            double fuelAmount = scanner.nextDouble();
            scanner.nextLine();

            //Every fuelling is added to the arraylist to handle more than fuelling and later
            //to display them separately.
            fuelAmountList.add(fuelAmount);
            double fuelCost = fuelAmount * fuelPrice;
            fuelCostList.add(fuelCost);

            //Currency € has cents 0-99, therefore final display for cost have to be 2 decimal points after.
            System.out.println("Fuelling: " + "\nAmount: " + String.format("%.2f", fuelAmount) + " litres\n"
                    + "Cost: " + String.format("%.2f",fuelCost) + "€");

            System.out.println("Press ENTER to add more fuel or 'finish' to stop: ");
            input = scanner.nextLine();
        }

    }
}