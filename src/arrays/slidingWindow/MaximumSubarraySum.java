package arrays.slidingWindow;

public class MaximumSubarraySum {
    public static void main(String[] args) {

        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));

    }
    static int maximumSubarraySum(int[] nums, int k) {

        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;

        if(nums.length < k){
            return 0;
        }

        while (j<nums.length){

            sum+=nums[j];

            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                maxsum = Math.max(maxsum, sum);
                sum = sum-nums[i];
                i++;
                j++;
            }
        }
        return maxsum;
    }
}
