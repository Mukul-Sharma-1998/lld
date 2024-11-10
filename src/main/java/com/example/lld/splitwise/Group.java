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
public class Group {
    private int id;
    private String groupName;
    private List<User> groupUsers;
    private List<Expense> groupExpenses;
    private ExpenseController expenseController = new ExpenseController();

    public Group(int id, String groupName, List<User> users, List<Expense> expenses) {
        this.id = id;
        this.groupName = groupName;
        this.groupUsers = users;
        this.groupExpenses = expenses;
    }
}
