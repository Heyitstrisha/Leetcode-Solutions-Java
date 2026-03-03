package arrays.twoPointer;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] num = {-1,0,1,2,-1,-4};
        System.out.println(threeSumgpt(num));
    }

    static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                List<Integer> li = new ArrayList<>();
                int k = -nums[i] + nums[j];
                Arrays.sort(nums);
                li.add(nums[i]);
                li.add(nums[j]);
                li.add(nums[k]);

                set.add(li);
            }
        }
        return new ArrayList<>(set);
    }

    static List<List<Integer>> threeSumgpt(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {

            //skip duplicate for i
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while (left<right){

                int sum = nums[i] + nums[left] + nums [right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));

                    //skip duplicate for left
                    if(left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    //skip duplicate for right
                    if(left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        return result;
    }
}
