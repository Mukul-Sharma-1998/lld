package com.example.lld.parkingLot.costCalculation;

import com.example.lld.parkingLot.Ticket;

public class FourWheelerCostCalculation implements CostCalculationStratergy{
    @Override
    public int calculateCost(Ticket ticket) {
        return 400;
    }
}
