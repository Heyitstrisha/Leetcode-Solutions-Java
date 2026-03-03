package arrays.twoPointer;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.

        String s = "babad";
        System.out.println(longestPalindrome(s));

    }
    static String longestPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;
        String str = "";

        while (start < end){

            while (s.charAt(start) != s.charAt(end)){
                start++;
                end--;
            }


        }
            return str;
    }
}

