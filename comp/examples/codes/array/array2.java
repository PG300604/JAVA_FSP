package comp.examples.codes.array;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] arr=new int[] {5,1,3,8,9,2};
        Arrays.sort(arr);
        for(int val:arr){
            System.out.println(val+" ");
        }
        System.out.println();
        Arrays.fill(arr,200);

        for(int data:arr)
        {
            System.out.println(data+" ");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr).getClass().getName());
        int[] original=new int[]{23,45,65,4,34};
        int[] copy=new int[5];
        copy= Arrays.copyOf(original,original.length);
        for(int val:copy){
            System.out.println(val+" ");
        }
        System.out.println(Arrays.binarySearch(original,45));
    }
}
