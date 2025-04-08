package comp.examples.codes.exception_handling;

public class Except1 {
    public static void main(String[] args) {
        try {
            int a = 20 / 0;
            System.out.println("Hello World !");
        }catch (Exception e){
            System.out.println("Don't Divide By Zero.");
            System.out.println("Hello World !");
        }
    }
}
