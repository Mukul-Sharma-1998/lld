package com.example.lld.calculator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Expression implements ArithmeticExpression{
    private ArithmeticExpression leftExpression;
    private Symbol symbol;
    private ArithmeticExpression rightExpression;

    @Override
    public int evaluate() {
        switch (this.symbol) {
            case ADD -> {
                return this.leftExpression.evaluate() + this.rightExpression.evaluate();
            }
            case SUBTRACT -> {
                return this.leftExpression.evaluate() - this.rightExpression.evaluate();
            }
            case MULTIPLY -> {
                return this.leftExpression.evaluate() * this.rightExpression.evaluate();
            }
            case DIVIDE -> {
                return this.leftExpression.evaluate() / this.rightExpression.evaluate();
            }
            default -> {
                return 0;
            }
        }
    }
}
