package arrays.twoPointer;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public static void main(String[] args) {

        //the array is sorted
        int[] num = {1, 1, 1, 2, 4, 5, 5, 2};
        System.out.println(removeDuplicates(num));
    }
    static int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[k] != nums[i]){
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1;
    }
}
