class Vehicle{
    void display(){
        String brand = "BMW";
        System.out.println("Brand: " + brand);
    }
}

class Bike extends Vehicle{
    int wheel = 2;

    void showDetails(){

        display();
        System.out.println("Wheels: " + wheel);
    }
}

class Car extends Vehicle{
    int wheel = 4;

    void showDetails(){
        display();

        System.out.println("Wheels: " + wheel);
    }
}

public class Inheritence2 {
    public static void main(String [] args){
        Bike b = new Bike();
        b.showDetails();

        Car c = new Car();
        c.showDetails();
    }
}
