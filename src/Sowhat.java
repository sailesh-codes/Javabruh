import java.util.Scanner;

public class Sowhat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String response = " ";

        while(!response.equals("Q")){
            System.out.println("Welcome to the game!");
            System.out.print("Enter a letter:");
            response = s.nextLine().toUpperCase();
        }

        System.out.println("THE GAME HAS STOPPED!");
    }
}