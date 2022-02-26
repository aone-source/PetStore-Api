package com.petstore.duties;

public class Cashier extends Duty {
    public Cashier() {super("Cashier");}

    @Override
    public String performDuty() {
        return sell();
    }

    private String sell(){
        return getName() + " : Thank you have a nice day!";
    }
}

