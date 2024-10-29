package com.example.lld.vendingMachine.vendingMachineImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.VendingMachine;
import com.example.lld.vendingMachine.VendingMachineState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dispatch implements VendingMachineState {
    private Item selectedItem;

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
        throw new Exception("You are not authorized to perform cancellation now!");
    }

    @Override
    public void depositMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You are not authorized to perform deposit now!");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to perform confirmation now!");
    }

    @Override
    public void dispatch(VendingMachine vendingMachine) throws Exception {
        System.out.println("|");
        System.out.println("Dispatch state");

        vendingMachine.getInventory().getItemCodeItemQuantityMap()
                .put(this.selectedItem.getItemCode() ,
                        vendingMachine.getInventory()
                                .getItemCodeItemQuantityMap().get(this.selectedItem.getItemCode()) - 1);
        System.out.println("Then Inventory is updated");
        System.out.println("The item is dispatched, please collect the item");

        System.out.println("|");
        vendingMachine.setState(new IdealState());
    }
}
