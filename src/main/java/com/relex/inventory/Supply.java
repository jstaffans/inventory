package com.relex.inventory;

public class Supply {

    private boolean unspoiled;
    private int amount;
    private String name;

    public Supply(int amount, String name) {
        this.amount = amount;
        this.name = name;
        this.unspoiled = true;
    }

    public boolean isUnspoiled() {
        return unspoiled;
    }

    public void setUnspoiled(boolean unspoiled) {
        this.unspoiled = unspoiled;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
