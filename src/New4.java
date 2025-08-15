class Animal{
    void sound(){
        System.out.println("Animal makes sound!");
    }
    void eat(){
        System.out.println("Animal eats!");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks!");
    }
    void eat(){
        System.out.println("Dog eats!");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows!");
    }
    void eat(){
        System.out.println("Cat eats!");
    }
}

public class New4 {
    public static void main(String [] args){
        Animal[] pets = {new Dog() , new Cat()};
        for(Animal x : pets){
            x.sound();
            x.eat();
        }
    }
}
