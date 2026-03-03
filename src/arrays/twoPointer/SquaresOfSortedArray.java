package arrays.twoPointer;

//https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;
import java.util.stream.Stream;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};
                    //16,1,0,9,100
        //output = [0,1,9,16,100]
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    static int[] sortedSquares(int[] nums) {

         int[] result = new int[nums.length];

         int start = 0;
         int end = nums.length-1;
         int p = nums.length-1;

         while (start <= end){

            int left = nums[start]*nums[start];
            int right = nums[end]*nums[end];

            if(left > right){
                result[p] = left;
                start++;
            }else {
                result[p] = right;
                end--;
            }
            p--;
         }

        return result;
    }
}
