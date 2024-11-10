package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExpenseController {
    private Map<Integer, Expense> expenseMap = new HashMap<>();
    private SplitValidatorFactory splitValidatorFactory = new SplitValidatorFactory();
    private BalanceSheetController balanceSheetController = new BalanceSheetController();

    public void addExpense(User paidBy, SplitType splitType, Map<User, Double> expenseSplit) {
        // validate expense
        // createe expense
        // update balanceSheet
    }
}
