package comp.examples.codes.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample { // Fixed class name to avoid conflict with java.util.ArrayList
    public static void main(String[] args) {
        Stack<String> arrList = new Stack<String>();
            arrList.push("Amit");
            arrList.push("Apple");
            arrList.push("Gaurav");

        while (!arrList.isEmpty()){
            arrList.pop();
        }

        Iterator<String> itr = arrList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
