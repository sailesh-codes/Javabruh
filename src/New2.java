import java.util.Random;
import java.util.Scanner;

public class New2 {
    public static void main(String [] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int guess = 0;
        int randNum = r.nextInt(1,101);
        int attempts = 0;

        System.out.println("Welcome to number guessing game!");
        System.out.println("Guess a number between 1-100");

        do{
            System.out.print("Enter the number:");
            guess = s.nextInt();
            attempts++;

            if(guess < randNum){
                System.out.println("Too low,try again!");
            }
            else if(guess > randNum){
                System.out.println("Too high,try again!");
            }
            else{
                System.out.println("CORRECT!");
            }

        }while(guess != randNum);

        System.out.println("The num is" + randNum);
        System.out.println("it took you" + attempts +"attempts to guess it!");
    }
}
