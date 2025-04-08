package comp.examples.codes.array;

public class array1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=200;
        System.out.println(arr[0]);

        String[] data;
        data=new String[] {"A","B","C","D"};
        System.out.println(data[3]);
        System.out.println(data.length);

        int[] values=new int[] {1,2,3,4,5};
        int sum=0;
        for(int val:values){
            sum+=val;
        }
        System.out.println("Sum = "+sum);
    }
}
