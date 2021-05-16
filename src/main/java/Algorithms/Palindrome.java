package Algorithms;

public class Palindrome {
    //Given a string s, return the longest palindromic substring in s.
    public String longestPalindrome(String s) {
        //babad
        String longestPalindrome = "";
        String sub = "";

        for (int i = 0; i < s.length(); i++) {
            for (int y = i; y < s.length(); y++) {

                sub = s.substring(i,y + 1);
                String currentPal = checkPalindrome(sub);
                if (currentPal.length() > longestPalindrome.length()) {
                    longestPalindrome = currentPal;
                }
            }
        }

        return longestPalindrome;
    }

    private String checkPalindrome(String sub) {
        StringBuilder rev = new StringBuilder(sub);
        if (sub.equals(rev.reverse().toString())) {
            return sub;
        } else return "";
    }


}
