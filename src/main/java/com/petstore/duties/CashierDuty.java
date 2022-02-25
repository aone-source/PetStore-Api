package com.petstore.duties;

public class CashierDuty extends Duty {
    public CashierDuty() {super("CashierDuty");}

    @Override
    public String performDuty() {
        return sell();
    }

    private String sell(){
        return getName() + " : Thank you have a nice day!";
    }
}

