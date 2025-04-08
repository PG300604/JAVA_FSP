package comp.examples.codes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<String>();
        arrayList.add("S");
        arrayList.add("A");
        arrayList.add("F");
        arrayList.add("D");

        System.out.println("Before Sorting : "+arrayList);
        Collections.sort(arrayList);
        System.out.println("After Sorting : "+arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("After Sorting in Reverse order : "+arrayList);
    }
}
