import java.util.Scanner;

public class New {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("what is the price of the item?: ");
        price = scanner.nextDouble();

        System.out.print("How much would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item);
        System.out.println("The total is "+currency + total);
    }
}
