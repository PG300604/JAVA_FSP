package comp.examples.codes.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(34);
        set.add(54);
        set.add(5);
        set.add(56);
        set.add(700);
        for(Integer itr:set){
            System.out.println(itr);
        }
    }
}

