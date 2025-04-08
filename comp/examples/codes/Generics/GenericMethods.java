package comp.examples.codes.Generics;

public class GenericMethods {
    public static <T> void display(T[] arr){
        for(T val:arr){
            System.out.println(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] newArray={4,5,6,7,8};
        String[] strArray={"A","B","C"};
        GenericMethods.display(newArray);
        GenericMethods.display(strArray);
    }
}
