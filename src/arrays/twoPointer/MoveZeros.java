package arrays.twoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        //o/p = [1,3,12,0,0]
        moveZeroes(arr);

    }
    static void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != 0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
        //Time Complexity: O(n)
        //Space Complexity: O(1)