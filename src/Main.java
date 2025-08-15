import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        double num1;
        double num2;
        char opr;
        double result = 0;

        System.out.print("Enter first number:");
        num1 = s.nextDouble();

        System.out.print("Enter operator (+ - * / ):");
        opr = s.next().charAt(0);

        System.out.print("Enter second number:");
        num2 = s.nextDouble();

        switch(opr){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;

            default -> System.out.println("Enter a valid operator!");
        }

        System.out.println("The answer is:" + result);
        s.close();
    }
}
