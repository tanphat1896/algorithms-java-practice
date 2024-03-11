package org.example.algorithm.stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        int[] numbers = new int[tokens.length];
        int pos = 0;

        for (String token : tokens) {
            if (token.equals("+")) {
                var second = numbers[--pos];
                var first = numbers[--pos];
                numbers[pos++] = first + second;
                continue;
            }
            if (token.equals("-")) {
                var second = numbers[--pos];
                var first = numbers[--pos];
                numbers[pos++] = first - second;
                continue;
            }
            if (token.equals("*")) {
                var second = numbers[--pos];
                var first = numbers[--pos];
                numbers[pos++] = first * second;
                continue;
            }
            if (token.equals("/")) {
                var second = numbers[--pos];
                var first = numbers[--pos];
                numbers[pos++] = first / second;
                continue;
            }
            numbers[pos++] = Integer.parseInt(token);
        }

        return numbers[0];
    }
}
