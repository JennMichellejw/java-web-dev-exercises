package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gallonsOfGas = input.nextDouble();
        input.close();

        double milesPerGallon = milesDriven/gallonsOfGas;

        System.out.println("Your mileage per gallon is " + milesPerGallon);


    }
}
