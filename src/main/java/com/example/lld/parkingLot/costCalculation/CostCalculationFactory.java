package com.example.lld.parkingLot.costCalculation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CostCalculationFactory {
    public FourWheelerCostCalculation fourWheelerCostCalculation;
    public TwoWheelerCostCalculation twoWheelerCostCalculation;
}
