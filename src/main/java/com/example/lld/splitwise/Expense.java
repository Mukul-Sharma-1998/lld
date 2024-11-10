package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Expense {
    private int id;
    private String description;
    private User paidBy;
    private SplitType splitType;
    private Split split;
}
