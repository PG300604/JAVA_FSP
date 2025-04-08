package comp.examples.codes.collections;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map =new java.util.HashMap<Integer,String>();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(5,"Amit");
        map.put(4,"Gaurav");

        for(Map.Entry<Integer,String> itr:map.entrySet()){
            System.out.println(itr.getKey()+":"+itr.getValue());
        }
    }
}
