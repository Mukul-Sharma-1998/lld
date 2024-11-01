package com.example.lld.calculator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Number implements ArithmeticExpression{
    private int number;
    @Override
    public int evaluate() {
        return this.number;
    }
}
