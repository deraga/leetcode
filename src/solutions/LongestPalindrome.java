package solutions;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("abccccdd"));
//        System.out.println(longestPalindrome("ccc"));
//        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("aba"));
    }

    public static int longestPalindrome(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int length = 0;
        boolean singleChar = false;
        char[] sortedChars = s.toCharArray();
        Arrays.sort(sortedChars);
        for (int i = 0; i < sortedChars.length - 1; i++) {
            char cCur = sortedChars[i];
            char cNext = sortedChars[i + 1];
            if (cNext == cCur) {
                length += 2;
                i++;
            } else {
                singleChar = true;
            }
        }
        if (singleChar || sortedChars.length % 2 == 1) {
            length++;
        }
        return length;
    }
}
