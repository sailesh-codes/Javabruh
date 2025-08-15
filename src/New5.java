import java.util.Scanner;

class Student{
    int ROLLNO;
    String NAME;
    float TAMIL,MATHS,TOTAL;


    void GETDATA(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your rollno:");
        ROLLNO = s.nextInt();
        s.nextLine();
        System.out.print("Enter name:");
        NAME = s.nextLine();
        System.out.print("Marks in Tamil:");
        TAMIL = s.nextFloat();
        System.out.print("Marks in maths:");
        MATHS = s.nextFloat();
        TOTAL = CTOTAL();
    }

    float CTOTAL(){
        return TAMIL + MATHS;
    }

    void DISPLAYDATA(){
        System.out.println();
        System.out.println("The data is");
        System.out.println("Roll no: "+ROLLNO);
        System.out.println("Name: "+NAME);
        System.out.println("Marks in Tamil: "+TAMIL);
        System.out.println("Marks in Maths: "+MATHS);
        System.out.println("Total marks: "+TOTAL);
    }

}
public class New5 {
    public static void main(String [] args){
        Student std = new Student();
        std.GETDATA();
        std.DISPLAYDATA();
    }
}
