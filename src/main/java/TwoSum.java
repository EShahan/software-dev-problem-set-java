import java.util.HashMap;

public class TwoSum {
    //Hashmap solution. We only need to find if there's a matching difference in the list.
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        //Convert array to Hashmap
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        //Iterate over list to find potential differences, then check against hashmap for matches. If there's a match return the indices.
        //If there's no matches in any loop return null.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indices.containsKey(complement) && indices.get(complement) != i) {
                return new int[]{i, indices.get(complement)};
            }
        }
        return null;
    }

    //Brute Force Solution.
//    static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
}
