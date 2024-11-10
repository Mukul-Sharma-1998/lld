package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private BalanceSheet balanceSheet;
    private List<Expense> expenses;
    private List<Group> groups;
    private ExpenseController expenseController = new ExpenseController();

    public User(int id, String name, BalanceSheet balanceSheet, List<Expense> expenses, List<Group> groups) {
        this.id = id;
        this.name = name;
        this.balanceSheet = balanceSheet;
        this.expenses = expenses;
        this.groups = groups;
    }
}
