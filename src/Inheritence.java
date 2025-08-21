class Animals{
    String name;

    Animals(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name + "is eating");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class sheep extends Animals{
    sheep(String name){
        super(name);
    }

    void bark(){
        System.out.println(name + "is barking!");
    }
}

class Cow extends Animals{
    Cow(String name){
        super(name);
    }

    void meow(){
        System.out.println(name + "is meowing!");
    }
}

public class Inheritence {
    public static void main(String [] args){
        sheep d = new sheep("Bobby");
        Cow c = new Cow("Tom");

        d.eat();
        d.sleep();
        d.bark();

        System.out.println();

        c.eat();
        c.sleep();
        c.meow();
    }
}
