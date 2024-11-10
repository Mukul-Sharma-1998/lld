package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserController {
    Map<Integer, User> userMap = new HashMap<>();

    public User createUser(int id, String name, BalanceSheet balanceSheet, List<Expense> expenses, List<Group> groups, ExpenseController expenseController) {
        User user = new User(id, name, balanceSheet, expenses, groups);
        this.userMap.put(user.getId(), user);
        return user;
    }
}
