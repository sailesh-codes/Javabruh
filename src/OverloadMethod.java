public class OverloadMethod {
    public static void main(String [] args){
        System.out.println(add(1,2 ,3, 4 ,5));
    }

    static double add(double a , double b){
        return a + b;
    }

    static double add(double a, double b , double c , double d){
        return a + b + c + d;
    }

    static double add(double a , double b , double c , double d , double e){
        return a + b - c * d + e;
    }
}
