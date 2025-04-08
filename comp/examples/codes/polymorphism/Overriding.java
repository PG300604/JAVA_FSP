package comp.examples.codes.polymorphism;
class Students {
    void study(){
        System.out.println("Students Studies");
    }
}

public class Overriding extends Students {
    @Override
    void study(){
        super.study();
        System.out.println("In child Class");
    }
    public static void main (){
        Overriding obj=new Overriding();
        obj.study();
    }
}
