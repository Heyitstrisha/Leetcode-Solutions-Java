package arrays.slidingWindow;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
public class MaxSum_DistinctSubarrays {
    public static void main(String[] args) {

        int[] arr= {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));

    }
    static long maximumSubarraySum(int[] nums, int k) {

        int i=0;
        long maxsum = Integer.MIN_VALUE;
        long sum = 0;

        Set<Integer> set = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {

            while (set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }

            sum = sum+nums[j];
            set.add(nums[j]);

            if(j-i+1 > k){
                sum = sum-nums[i];
                set.remove(nums[i]);
                i++;
            }

            if(j-i+1 == k){
                maxsum=Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}
