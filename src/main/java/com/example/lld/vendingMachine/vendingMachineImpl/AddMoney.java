package com.example.lld.vendingMachine.vendingMachineImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.VendingMachine;
import com.example.lld.vendingMachine.VendingMachineState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddMoney implements VendingMachineState {
    private Item selectedItem;
    private List<Coin> coins = new ArrayList<>();
    private Integer totalAddedValue = 0;
    @Override
    public void startSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to start selection now!");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int itemCode) throws Exception {
        throw new Exception("You are not authorized to perform selection now!");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) throws Exception {
        System.out.println("|");

        System.out.println("Current added value: " + this.totalAddedValue);
        System.out.println("Refunding the added value");
        for(Coin coin : this.coins) {
            System.out.println(coin.getValue());
        }
        this.totalAddedValue = 0;
        this.setSelectedItem(null);
        vendingMachine.setState(new IdealState());

        System.out.println("|");
    }

    @Override
    public void depositMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("|");
        System.out.println("Add money state");

        this.getCoins().add(coin);
        this.totalAddedValue = this.totalAddedValue + coin.getValue();
        System.out.println("Current added value: " + this.totalAddedValue);

        System.out.println("|");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) throws Exception {
        System.out.println("|");

        if(this.totalAddedValue < this.selectedItem.getItemPrice()) {
            System.out.println("You are short of money, please add: " + (this.selectedItem.getItemPrice() - this.totalAddedValue));
        } else {
            for(Coin coin : this.coins) {
                if(vendingMachine.getTotalBalance().get(coin) != null) {
                    vendingMachine.getTotalBalance().put(coin, vendingMachine.getTotalBalance().get(coin) + 1);
                } else {
                    vendingMachine.getTotalBalance().put(coin, 1);
                }
            }

            vendingMachine.setState(new Dispatch(this.selectedItem));
        }
        System.out.println("|");
    }

    @Override
    public void dispatch(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to perform dispatch now!");
    }
}
