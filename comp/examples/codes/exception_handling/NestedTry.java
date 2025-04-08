package comp.examples.codes.exception_handling;

public class NestedTry {
    public static void main(String[] args) {
       try {
           int a = 20 / 0;
           System.out.println(a);
           try {
               int[] arr=new int[5];
               System.out.println(arr[20]);
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Exception on Nested try block !!!");
           }
       }catch (ArithmeticException e) {
           System.out.println("Exception of main Try block !!!");
       }
    }
}
