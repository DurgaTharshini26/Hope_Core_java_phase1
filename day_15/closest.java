package day_15;

import java.util.TreeSet;
//in a array find the closest element to the target element using treeset

public class closest{

    public static int clos(int[] arr, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        Integer floor = set.floor(target);  
        Integer ceil = set.ceiling(target); 
        if (floor == null) return ceil;
        if (ceil == null) return floor;
        if (Math.abs(target - floor) <= Math.abs(ceil - target)) {
            return floor;
        } else {
            return ceil;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 15,20,25,40};
        int target = 25;

        System.out.println(clos(arr, target)); 
    }
}