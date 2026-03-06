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

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            int left = i;
            int right = i;

            while (left >= 0 && right <= s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
        }

        return str;
    }
}

