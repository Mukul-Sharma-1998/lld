package com.example.lld.splitwise;

import java.util.Map;

public class PercentageSplitValidator implements SplitValidator{
    @Override
    public boolean validateExpense(User paidBy, SplitType splitType, Map<User, Double> userSplits) {
        return true;
    }
}
