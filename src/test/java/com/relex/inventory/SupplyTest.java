package com.relex.inventory;

import junit.framework.TestCase;

public class SupplyTest extends TestCase {

    public void testFreshSupply() {
        Supply s = new Supply(100, "apples");
        assertEquals(100, s.getAmount());
        assertTrue(s.isUnspoiled());
    }

}
