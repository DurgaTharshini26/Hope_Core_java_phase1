package day_15;

import java.util.*;

public class mapeg {
    public static void main(String[] args) {
       int[] arr={1,2,3,3,4,5};
       Map<Integer,Integer> map=new java.util.HashMap<>();
for(int i=0;i<arr.length;i++){
    map.put(i,arr[i]);
}
// Iterate through the map and print key-value pairs
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
}
System.out.println(map);
}
}
