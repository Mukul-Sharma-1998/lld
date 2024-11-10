package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BalanceSheet {
    private double totalLend;
    private double totalOwe;
    private Map<User, Balance> userBalanceMap;
}
