package Algorithms;

public class BracketsBalance {

    public static boolean doBracketsBalance(String s) {
        int curlOpen = 0; // {
        int squareOpen = 0; // [
        int curvedOpen = 0; // (

        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                    curlOpen++;
                    break;

                case '}':
                    if (curlOpen > 0) curlOpen--;
                    else return false;
                    break;

                case '[':
                    squareOpen++;
                    break;

                case ']':
                    if (squareOpen > 0) squareOpen--;
                    else return false;
                    break;

                case '(':
                    curvedOpen++;
                    break;

                case ')':
                    if (curvedOpen > 0) curvedOpen--;
                    else return false;
                    break;
            }
        }
        if (curlOpen != 0 || squareOpen != 0 || curvedOpen != 0) {
            return false;
        }
        return true;
    }
}
