package File6_Recursion.Scripts;

/*


3. Longest Substring Without Repeating Characters
Medium

29064

1239

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Approach 1. Hashmaps and Sliding window
class Solution {

    public static void main(String[] args) {
        String abc = "abcabcbb";//3 abc
        String b = "bbbbb";//1 b
        String wke = "pwwkew";//3 wke

        System.out.println(lengthOfLongestSubstring(abc));
        System.out.println(lengthOfLongestSubstring(b));
        System.out.println(lengthOfLongestSubstring(wke));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();

        int ptr_l = 0;  // Create pointer to the left side of the string
        int ptr_r = 0; // Create pointer to the right

		/**
		Now we are incrementing the right poiter by one, as we go through the string. If we encounter which already was in our
		hash-map we check whether its index is bigger than ptr_l, if so we set ptr_l to the index of that character + 1.
		ptr_l by one. Then set the index of the character to the new index.

		If character wasn't in a hashmap, we just add it to the hashmap with the index it was.
		*/
        while(ptr_r < s.length()){
            if(!map.containsKey(s.charAt(ptr_r)))
                map.put(s.charAt(ptr_r), ptr_r);
            else{
                if(ptr_l <= map.get(s.charAt(ptr_r))) // If ptr_l > index, then it is unnessecary to move ptr_l backwards as we have already been there.
                    ptr_l = map.get(s.charAt(ptr_r)) + 1;
                map.replace(s.charAt(ptr_r), ptr_r); // update to the newer index
            }

            ptr_r++;
            if(ptr_r - ptr_l > maxLength)
                maxLength = ptr_r - ptr_l;
        }

        System.out.println(map);

        return maxLength;
    }
}


//Approach 2. Using HashSet
class MySolution {

    public static void main(String[] args) {
        String abc = "abcabcbb";//3 abc
        String b = "bbbbb";//1 b
        String wke = "pwwkew";//3 wke

        System.out.println(longestSubstringNoRepeat(abc));
        System.out.println(longestSubstringNoRepeat(b));
        System.out.println(longestSubstringNoRepeat(wke));

    }

    private static int longestSubstringNoRepeat(String originalString) {

        int output = 0;
        int length = originalString.length();

        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < length; right++) {
            char currentChar = originalString.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(originalString.charAt(left));
                left++;
            }
            set.add(currentChar);
            output = Math.max(output, right - left + 1);
        }

        return output;
    }
}

