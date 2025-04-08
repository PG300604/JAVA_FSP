package comp.examples.codes.exception_handling;

public class Except2 {
    public static void main(String[] args) {
        try{
            int [] arr=new int[5];
            System.out.println(arr[4]);
        }catch (NullPointerException e){
            System.out.println("Null Error !!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Bound Exception !!!");
        }finally {
            System.out.println("Finally Block !!!");
        }
    }
}
