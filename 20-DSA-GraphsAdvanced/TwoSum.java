// ============================================
// Module: 20-DSA-GraphsAdvanced
// Program: TwoSum
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Two sum problem
// ============================================
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found");
        }
    }
}
