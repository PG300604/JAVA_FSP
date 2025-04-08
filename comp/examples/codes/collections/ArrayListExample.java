package comp.examples.codes.collections;

import java.util.ArrayList; // Import ArrayList
import java.util.Iterator;
import java.util.List;

public class ArrayListExample { // Fixed class name to avoid conflict with java.util.ArrayList
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>(); // No need for casting
        arrList.add("Amit");
        arrList.add("Apple");
        arrList.add("Gaurav");
        arrList.remove(0);

        Iterator<String> itr = arrList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}





