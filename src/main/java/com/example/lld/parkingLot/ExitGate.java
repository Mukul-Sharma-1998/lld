package com.example.lld.parkingLot;

import com.example.lld.parkingLot.costCalculation.CostCalculationFactory;
import com.example.lld.parkingLot.payment.PaymentFactory;
import com.example.lld.parkingLot.payment.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExitGate {
    public CostCalculationFactory costCalculationFactory;
    public PaymentFactory paymentFactory;

    public int calculateCost(Ticket ticket) {
        if(ticket.getParkingSpot().getParkingSpotType().equals(ParkingSpotType.FOURWHEELER)) {
            return costCalculationFactory.fourWheelerCostCalculation.calculateCost(ticket);
        }
        else {
            return costCalculationFactory.twoWheelerCostCalculation.calculateCost(ticket);
        }
    }
    public void makePayment(Ticket ticket, PaymentType paymentType) {
        int cost = this.calculateCost(ticket);

        if(paymentType.equals(PaymentType.CASH)) {
            ticket.paymentStatus = paymentFactory.getPayWithCash().pay(cost);
        }
        else {
            ticket.paymentStatus = paymentFactory.getPayWithCard().pay(cost);
        }
        if(ticket.paymentStatus) {
            this.vacateParkingSlot(ticket.getParkingSpot());
        }

    }
    public void vacateParkingSlot(ParkingSpot parkingSpot) {
        parkingSpot.vacateParkingSlot();
    }
}
