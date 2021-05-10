package Algorithms;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threes = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k =j+1; k < nums.length; k++) {

                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        ArrayList<Integer> l = new ArrayList<Integer>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(l);
                        threes.add(l);
                    }
                }
            }
        }
        List<List<Integer>> complete = new ArrayList<>(threes);
        return complete;
    }
}
