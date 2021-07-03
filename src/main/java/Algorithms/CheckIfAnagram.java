package Algorithms;

import java.util.Arrays;

public class CheckIfAnagram {

    //Check whether two strings are anagram of each other

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] stringArr1 = s1.toCharArray();
        char[] stringArr2 = s2.toCharArray();
        Arrays.sort(stringArr1);
        Arrays.sort(stringArr2);

        for (int i = 0; i < stringArr1.length; i++) {
            if (stringArr1[i] != stringArr1[i]) {
                return false;
            }
        }
        return true;
    }
}
