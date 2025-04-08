package comp.examples.codes.Generics;

import java.util.ArrayList;
import java.util.Iterator;

 public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(34);
        arrayList.add(25);
        arrayList.add(25);
        //arrayList.add("Hello");
        System.out.println(arrayList);
        Iterator<Integer> itr=arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
