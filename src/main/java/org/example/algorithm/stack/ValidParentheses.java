package org.example.algorithm.stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        int idx = 0;
        byte[] stack = new byte[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack[idx++] = (byte) c;
                continue;
            }

            // '{' - '}' = -2 ; '[' - ']' = -2; '(' - ')' = -1
            if (idx <= 0 || Math.abs(stack[--idx] - c) > 2) {
                return false;
            }
        }

        return idx == 0;
    }
}
