package comp.examples.codes.polymorphism;

public class Overloading {
    void result(){
        System.out.println("We are Performing Polymophism.");
    }
    void result(int x){
        System.out.println("We are in Class Overloading.");
    }
    public static void main (String[] args){
        Overloading o=new Overloading();
        o.result();
        o.result(34);
    }
}

