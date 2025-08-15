import java.util.Scanner;

public class New3 {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter income:");
        double income = s.nextDouble();
        double tax = 0;
        double surcharge = 0;

        if(income > 250000){
            tax += (income - 250000) * 0.30;
            income = 250000;
        }

        if(income > 100000){
            tax += (income - 100000) * 0.20;
            income = 100000;
        }

        if(income > 50000){
            tax += (income - 50000) * 0.10;
        }

        if(tax > 10000){
            surcharge = tax * 0.2;
        }

        System.out.println("Income: "+income);
        System.out.println("Tax: "+tax);
        System.out.println("Surcharge: "+surcharge);
    }
}
