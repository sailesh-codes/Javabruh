import java.util.Scanner;

public class New1 {
    public static void main(String [] args){

        int num;
        boolean val = true;

        Scanner s = new Scanner(System.in);

        System.out.print("Enetr a number from 1-10:");
        num = s.nextInt();

        if(num <= 5 && !val){
            System.out.println("Really!");
            System.out.println("sad!");
        }

        else{
            System.out.println("Duh!");
        }
    }
}
