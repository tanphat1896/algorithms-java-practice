package org.example.algorithm.twopointer;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        if (s.isBlank()) {
            return true;
        }

        int len = s.length();
        int low = 0 , high = len - 1;
        while (low <= high) {
            while (low < len && nonAlphaNumeric(s.charAt(low))) {
                low++;
            }

            while (high >= 0 && nonAlphaNumeric(s.charAt(high))) {
                high--;
            }

            if (high < 0 && low >= len) {
                return true;
            }

            if (!eq(s.charAt(low), s.charAt(high))) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    private boolean eq(char x, char y) {
        if (Character.isDigit(x) || Character.isDigit(y)) {
            return x == y;
        }
        int diff = Math.abs(x - y);
        return diff == 32 || diff == 0;
    }

    private boolean nonAlphaNumeric(char x) {
        return (x < 'a' || x > 'z') && (x < 'A' || x > 'Z') && (x < '0' || x > '9');
    }
}
