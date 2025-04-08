package comp.examples.codes;

public class Constructor_Overloading {
    public Constructor_Overloading(int x){
        System.out.println("Int is : "+x);
    }
    public Constructor_Overloading(double x){
        System.out.println("Double is :"+x);
    }

    public static void main(String[] args) {
        Constructor_Overloading co=new Constructor_Overloading(7);
        Constructor_Overloading co1=new Constructor_Overloading(67.87);
    }
}
