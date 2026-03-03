package arrays.twoPointer;

//https://leetcode.com/problems/reverse-string/

public class ReverseString {
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        reverse(ch);
    }

    static void reverse(char[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<end){

            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
        System.out.println(arr);

    }

}
