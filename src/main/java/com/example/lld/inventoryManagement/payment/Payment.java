package com.example.lld.inventoryManagement.payment;

import com.example.lld.inventoryManagement.payment.PaymentFactory;
import com.example.lld.inventoryManagement.payment.PaymentMethod;
import com.example.lld.inventoryManagement.payment.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {
    private PaymentStatus paymentStatus;
    private int price;
    private PaymentMethod paymentMethod;
    private PaymentFactory paymentFactory;

    public void makePayment() {
        this.paymentStatus = PaymentStatus.PROCESSING;
        if(this.paymentMethod == PaymentMethod.UPI) {
            if (this.paymentFactory.getUpi().pay(this.price)) {
                this.paymentStatus = PaymentStatus.PAID;
            } else {
                this.paymentStatus = PaymentStatus.FAILED;
            }
        }
        else if(this.paymentMethod == PaymentMethod.CASH) {
            if (this.paymentFactory.getCash().pay(this.price)) {
                this.paymentStatus = PaymentStatus.PAID;
            } else {
                this.paymentStatus = PaymentStatus.FAILED;
            }
        }
        else {
            this.paymentStatus = PaymentStatus.FAILED;
        }
    }
}
