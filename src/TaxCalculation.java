import java.util.Scanner;

public class TaxCalculation {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        double income;
        double tax = 0;
        double surcharge = 0;

        System.out.print("Enter your income:");
        income = s.nextDouble();

        if(income <= 50000){
            tax = 0;
        }

        else if(income <= 100000){
            tax = (income - 50000) * 0.10;
        }

        else if(income <= 250000){
            tax = (income - 100000) * 0.20;
        }

        else{
            tax = 35000 + (income - 250000) * 0.30;
        }

        if(tax > 10000){
            surcharge = tax * 0.02;
        }

        System.out.println("Your income is: " + income);
        System.out.println("Tax :" + tax);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total pay: " + (tax + surcharge));
    }
}
