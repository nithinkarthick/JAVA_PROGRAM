package com.example.java;

import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String expr1 = "(a+b)(a*b)";
        String expr2 = "(ab)(ab+)";
        String expr3 = "((a+b)";

        System.out.println("Expression: " + expr1 + " - " + isValid(expr1));
        System.out.println("Expression: " + expr2 + " - " + isValid(expr2));
        System.out.println("Expression: " + expr3 + " - " + isValid(expr3));
    }

    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        boolean expectingOperand = true; // Initially expecting an operand

        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
                expectingOperand = true; // Expecting an operand after an opening parenthesis
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // Invalid expression
                }
                stack.pop();
                expectingOperand = false; // Expecting an operator or closing parenthesis after an operand
            } else {
                // Non-parenthesis character
                if (expectingOperand) {
                    expectingOperand = false; // Found an operand
                } else {
                    return false; // Invalid expression (consecutive operands or operators)
                }
            }
        }

        return stack.isEmpty() && !expectingOperand; // Valid expression if stack is empty and not expecting an operand
    }
}
