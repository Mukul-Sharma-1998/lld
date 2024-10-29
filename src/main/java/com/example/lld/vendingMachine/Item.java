package com.example.lld.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {
    private Integer itemCode;
    private ItemType itemType;
    private Integer itemPrice;

    public String toString() {
        return this.getItemType().toString() + " " + this.getItemPrice().toString() + " " + this.getItemCode().toString();
    }
}
