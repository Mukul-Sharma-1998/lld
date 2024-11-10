package com.example.lld.splitwise;

import java.util.Map;

public interface SplitValidator {

    public boolean validateExpense(User paidBy, SplitType splitType, Map<User, Double> userSplits);
}
