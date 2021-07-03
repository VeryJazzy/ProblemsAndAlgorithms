import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.doTheThing();
    }

    public void doTheThing() {
     twoStrings("jackcastle", "qwerty");

    }

    public static String twoStrings(String s1, String s2) {
        List<Character> listC = new ArrayList<Character>();
        for (char c : s2.toCharArray()) {
            listC.add(c);
        }
        HashSet<Character> s2hashSet = new HashSet<Character>(listC);

        for (char c : s1.toCharArray()) {
            if (s2hashSet.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }





}



