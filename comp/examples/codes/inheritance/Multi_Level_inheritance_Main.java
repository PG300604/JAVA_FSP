package comp.examples.codes.inheritance;
class Animal{
    void data(){
        System.out.println("We are in Animal Class.");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Mammals can walk.");
    }
}
class kid extends Mammal{
    void eat(){
        System.out.println("Kids can Eat !!");
    }
}

public class Multi_Level_inheritance_Main {
    public static void main (String[] args){
        kid k =new kid();
        k.data();
        k.walk();
        k.eat();
    }
}
