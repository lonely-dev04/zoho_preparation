import java.util.*;

public class LongestSubstringWithoutDuplicates {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while (set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutDuplicates solution = new LongestSubstringWithoutDuplicates();

        // Test cases
        String[] testCases = {
            "abcabcbb",
            "bbbbb",
            "pwwkew",
            "",
            "a",
            "au",
            "dvdf",
            "abba",
            "tmmzuxt",
            "anviaj"
        };

        for (String testCase : testCases) {
            int result = solution.lengthOfLongestSubstring(testCase);
            System.out.println("Input: \"" + testCase + "\" → Output: " + result);
        }
    }
}
