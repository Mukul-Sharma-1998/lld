package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SplitValidatorFactory {
    private SplitValidator equalSplitValidator = new EqualSplitValidator();
    private SplitValidator percentageSplitValidator = new PercentageSplitValidator();
}
