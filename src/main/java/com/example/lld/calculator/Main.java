package com.example.lld.calculator;

public class Main {
    public static void main(String[] args) {
        // 2 * (1 + 7) = 16
        ArithmeticExpression number1 = new Number(2);
        ArithmeticExpression number2 = new Number(1);
        ArithmeticExpression number3 = new Number(7);

        ArithmeticExpression expression1 = new Expression(number2, Symbol.ADD, number3);
        ArithmeticExpression expression2 = new Expression(number1, Symbol.MULTIPLY, expression1);

        System.out.println(expression2.evaluate());

    }
}
