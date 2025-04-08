package comp.examples.codes;

public class NestedClass {
    int outerVar=10;
    static class Nested{
        void Display(){
            System.out.println("In Static nested class");
        }
    }
    class InnerClass{
        void Display(){
            System.out.println("In Inner Class.");
        }
    }

    public static void main(String[] args) {
        NestedClass.Nested nested=new NestedClass.Nested();
        nested.Display();

        NestedClass obj = new NestedClass();
        NestedClass.InnerClass data =obj.new InnerClass();
        data.Display();
    }
}
