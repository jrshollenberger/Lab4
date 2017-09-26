
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]){
        Scanner lab3scnr = new Scanner(System.in);
        double MPG = 0;
        double TnkCap = 0;
        double Filled = 0;
        double rawRange = 0;

        System.out.println("Enter your car's MPG rating as a positive integer:");
        MPG = lab3scnr.nextDouble();

        if (MPG <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }
        else {

            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number:");
            TnkCap = lab3scnr.nextDouble();

            if (TnkCap <= 0) {
                System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR TANK CAPACTIY!!!");
            }
            else {

                System.out.println("Enter the percentage of the gas tank that it currently filled (from 0-100%):");
                Filled = lab3scnr.nextDouble();

                if (Filled <= 0) {
                    System.out.println("ERROR: PERCENTAGE MUST BE A NUMBER IN THE RANGE OF 0-100!!!");
                }
                else if (Filled > 100) {
                    System.out.println("ERROR: PERCENTAGE MUST BE A NUMBER IN THE RANGE OF 0-100!!!");
                }
                else {
                    rawRange = (MPG * TnkCap * (Filled * 0.01));

                    DecimalFormat numberFormat = new DecimalFormat("#.00");


                    if (rawRange <= 25) {
                        System.out.println("Attention! Your current estimated range is running low: " + (numberFormat.format(rawRange) + " miles left!"));
                    } else {
                        System.out.println("Keep driving! Your current estimated range is: " + (numberFormat.format(rawRange) + " miles!"));
                    }
                }
            }
        }
    }
    }
