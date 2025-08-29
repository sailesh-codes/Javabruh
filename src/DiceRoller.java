import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    private static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int numOfDice ;
        int total = 0;

        System.out.print("Enter # of dice to roll: ");
        numOfDice = s.nextInt();

        if(numOfDice > 0){
            for(int i = 0 ; i < numOfDice ; i++){
                int roll = r.nextInt(1,7);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("The number of dice should be positive!");
        }
    }
}
