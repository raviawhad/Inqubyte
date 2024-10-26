package com.example.demo;

import java.util.Stack;

public class StringCalculater {

    public int calculater(String s) {
        int number = 0;
        int result = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * number;
                result *= stack.pop();
                result += stack.pop();
                number = 0; // Reset number after closing parenthesis
            }
        }
        result += sign * number;

        return result;
    }

    public static void main(String[] args) {
        StringCalculater calculator = new StringCalculater();
        String expression = "3+(6-(8+2))+4"; // Example expression
        System.out.println("Result: " + calculator.calculater(expression)); // Should output: 3
    }
}
