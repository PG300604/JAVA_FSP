package comp.examples.codes.polymorphism;

public class Overloading_with_Return_type {
    double result(double a)
    {
        return a;
    }
    int result(int x){
        return x;
    }
    public static void main (String [] args){
        Overloading_with_Return_type obj =new Overloading_with_Return_type();
        System.out.println(obj.result(34));
        System.out.println(obj.result(67.808));

    }
}
