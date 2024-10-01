package com.example.lld.stratergyDesignPattern.VehicleExample;

import com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment.NormalUser;
import com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment.SuperUser;
import com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment.User;
import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.BtcPayment;
import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.CardPayment;
import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.CashPayment;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentMain {

    public static void main(String[] agrs) {

        User normalUser1 = new NormalUser(new CashPayment());
        normalUser1.paymentMethod.payment();

        User normalUser2 = new NormalUser(new CardPayment());
        normalUser2.paymentMethod.payment();

        User superUser1 = new SuperUser(new CardPayment());
        superUser1.paymentMethod.payment();

        User superUser2 = new SuperUser(new BtcPayment());
        superUser2.paymentMethod.payment();
    }
}
