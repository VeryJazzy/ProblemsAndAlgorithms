public class Kaprekar {

    public static boolean isKaprekar(int n) {
        String squared = String.valueOf(n * n);

        for (int i = 1; i < squared.length(); i++) {
            int first = Integer.parseInt(squared.substring(0, i));
            int second = Integer.parseInt(squared.substring(i));
            if (first == 0 || second == 0) {
                continue;
            }
            if (first + second == n) {
                return true;
            }
        }
        return false;
    }
}
