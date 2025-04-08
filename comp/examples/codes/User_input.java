package comp.examples.codes;
import java.util.Scanner;

public class User_input {
    public static void main (String[] args){
        int x;
        float y;
        String z;
        System.out.println("Enter the int Value : ");
        Scanner sc =new Scanner(System.in);
        x= sc.nextInt();
        System.out.println("Value is : "+x);
        System.out.println("Enter the float Value : ");
        Scanner sa =new Scanner(System.in);
        y= sa.nextFloat();
        System.out.println("Value is : "+y);
        System.out.println("Enter the String Value : ");
        Scanner sb =new Scanner(System.in);
        z= sb.nextLine();
        System.out.println("Value is : "+z);
    }
}
