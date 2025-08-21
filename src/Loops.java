import java.util.Scanner;

public class Loops {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);


        System.out.print("Enter your mark:");
        int mark = s.nextInt();

        if(mark >= 90){
            System.out.println("O grade!");
        }

        else if(mark >= 80){
            System.out.println("A+ grade!");
        }

        else if(mark >= 70){
            System.out.println("B grade!");
        }

        else{
            System.out.println("FAIL!");
        }


        for(int j = 0 ; j < 4 ; j++){
            System.out.println(j+" ");
        }
    }
}
