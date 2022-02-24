package com.petstore.duties;

public class ManagerialDuty extends Duty {
    public ManagerialDuty() {
        super("ManagerialDuty");
    }

    @Override
    public String performDuty() {
        return openStore();
    }

    private String openStore(){
        return getName() + " : open store";
    }
}
