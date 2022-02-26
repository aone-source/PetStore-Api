package com.petstore.duties;

public class Manager extends Duty {

    public Manager() {super("Manager");}

    @Override
    public String performDuty() {
        StringBuilder output = new StringBuilder();
        output.append(openStore() + "\n");
        output.append(makeSchedules() + "\n");
        output.append(closeStore() + "\n");

        return output.toString().trim();
    }


    private String openStore(){return getName() + " : open store";}

    private String makeSchedules(){return getName() + " : schedules are made";}

    private String closeStore(){return getName() + " : close store";}
}
