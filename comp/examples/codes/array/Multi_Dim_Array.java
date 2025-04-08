package comp.examples.codes.array;

import java.util.Scanner;

public class Multi_Dim_Array {
    public static void main(String[] args) {
        int [] [] matrix=new int[4][3];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.println("Entry for Row "+i+" Collumn  "+j);
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
                sum=sum+matrix[i][j];
            }
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}