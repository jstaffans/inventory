package com.relex.inventory;

import java.util.Random;

public class Spoilage1 {

    public static void spoil(Inventory inventory) {
        for (Supply supply : inventory.getSupplies()) {
            if (new Random().nextInt() % 2 == 0) {
                supply.setAmount(supply.getAmount() - 1);
                supply.setUnspoiled(false);
            }
        }

    }
}
