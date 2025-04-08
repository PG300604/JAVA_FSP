package comp.examples.codes.out.production.codes.comp.examples.codes;
import java.util.Scanner;

public class User_Input_Limit {
    public static void main(String[] args) {
        char x;
        System.out.println("Enter the char Value : ");
        Scanner sc = new Scanner(System.in);
        x = sc.next(".").charAt(0);
        System.out.println("Value is : " + x);
    }
}
