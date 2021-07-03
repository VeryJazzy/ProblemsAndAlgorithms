package Algorithms;

public class myAtoi {

    public static int myAtoi(String s) {
        s = removeWhitespaces(s);
        if (s.isEmpty()) {
            return 0;
        }
        boolean pos = checkIfPositive(s);
        s = removePlusMinus(s);
        String digitsOnly = extractDigits(s);

        digitsOnly = removeLeadingZeros(digitsOnly);

        if (digitsOnly.isEmpty()) {
            return 0;
        }

        int answer = 0;
        answer = checkIfOutOfBounds(digitsOnly, pos);

        if (!pos) {
            return answer *= -1;
        }
        return answer;
    }

    private static int checkIfOutOfBounds(String digitsOnly, boolean pos) {
        if (digitsOnly.length() > 18) {
            if (!pos) {
                return -2147483648;
            } return 2147483647;
        }

        long l = Long.parseLong(digitsOnly);
        if (!pos) {
            l *= -1;
        }

        if (l > 2147483647) {
            return 2147483647;
        } else if (l < -2147483647) {
            return -2147483648;
        }
        return Integer.parseInt(digitsOnly);
    }

    private static String removeLeadingZeros(String digitsOnly) {
        int counter = 0;
        for (char c : digitsOnly.toCharArray()) {
            if (c == '0') {
                counter++;
            } else break;
        }
        return digitsOnly.substring(counter);
    }


    private static String extractDigits(String s) {
        StringBuilder digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else break;
        }
        return digits.toString();
    }

    private static String removePlusMinus(String s) {
        if (s.charAt(0) == '-') {
            return s.substring(1);
        } else if (s.charAt(0) == '+') {
            return s.substring(1);
        }
        return s;
    }

    private static boolean checkIfPositive(String s) {
        if (s.charAt(0) == '-') {
            return false;
        }
        return true;
    }

    private static String removeWhitespaces(String s) {
        return s.trim();
    }
}
