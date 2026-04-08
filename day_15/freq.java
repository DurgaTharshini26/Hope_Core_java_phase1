package day_15;
//freq of each element in an array using hashmap

import java.util.Map;

public class freq {
    public static void main(String[] args) {
    Map<Integer, Integer> map = new java.util.HashMap<>();
    int[] arr = {1,1, 2, 3, 3,3,3, 4, 5};
    for(int num:arr){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        System.out.println("Element: "+entry.getKey()+" Frequency: "+entry.getValue());
    }
}
}