package Algorithms;

import java.util.ArrayList;

public class lengthOfLongestSubstring {
    //Given a string s, find the length of the longest substring without repeating characters.

    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> substringLengths = new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            substringLengths.add(findLengthOfCurrentSubstringBeforeItRepeatsAChar(i, s));
        }

        return findBiggestSubstring(substringLengths);
    }


    public int findLengthOfCurrentSubstringBeforeItRepeatsAChar(int i, String s) {
        ArrayList<Character> charList = new ArrayList<Character>();

        for (int y = i; y < s.length(); y++) {
            if (charList.contains(s.charAt(y))) {
                break;
            }
            charList.add(s.charAt(y));
        }
        return charList.size();
    }

    public int findBiggestSubstring(ArrayList<Integer> substringLengths) {
        int biggestSubstring = 0;
        for (int i : substringLengths) {
            if (i > biggestSubstring) {
                biggestSubstring = i;
            }
        }
        return biggestSubstring;
    }
}
