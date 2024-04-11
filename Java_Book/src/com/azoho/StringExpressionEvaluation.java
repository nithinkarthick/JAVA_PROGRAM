package com.azoho;

import java.util.Stack;

public class StringExpressionEvaluation {
    public static int evaluateExpression(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int num = 0;
        char sign = '+';

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == chars.length - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                sign = c;
                num = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "12345*+-+";
        int output = evaluateExpression(input);
        System.out.println("Output: " + output);
    }
    
    
    
//    Given a String with numbers and operators. Perform the operations on the numbers in their respective order. 
//    Input : "12345*+-+"
//    Output: 6
//    Explanation: [1*2+3-4+5 = 6] 
    
    
    
}

