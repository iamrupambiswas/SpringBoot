package AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        System.out.println(nums);
    }
}