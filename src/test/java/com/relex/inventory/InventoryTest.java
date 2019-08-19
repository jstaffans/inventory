package com.relex.inventory;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {

    public void testInventorySize() {
        List<Supply> supplies = new ArrayList<>();
        supplies.add(new Supply(100, "apples"));
        supplies.add(new Supply(200, "oranges"));
        Inventory i = new Inventory(supplies);
        assertEquals(300, i.getSize());
    }
}
