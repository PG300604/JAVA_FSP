package comp.examples.codes.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(34);
        set.add(54);
        set.add(56);
        set.add(56);
        set.add(700);
        for(Integer itr:set){
            System.out.println(itr);
        }
    }
}
