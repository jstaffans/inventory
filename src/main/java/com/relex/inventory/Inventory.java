package com.relex.inventory;

import java.util.List;

public class Inventory {

    private final List<Supply> supplies;

    Inventory(List<Supply> supplies) {
        this.supplies = supplies;
    }

    List<Supply> getSupplies() {
        return supplies;
    }

    int getSize() {
        int total = 0;

        for (Supply supply : supplies) {
            total += supply.getAmount();
        }

        return total;
    }

}
