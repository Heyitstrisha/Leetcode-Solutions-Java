package arrays.twoPointer;

//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        //output = 49
        System.out.println(maxArea(arr));
    }
    static int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;
        int maxarea=0;

        while (start < end){

            int width = end-start;
            int length = Math.min(height[start],height[end]);
            int area = length * width; //area = length * width

            maxarea = Math.max(area,maxarea);

            if(height[start] < height[end]){
                start++;
            }else {
                end--;
            }

        }
        return maxarea;

    }
}
