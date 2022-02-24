package com.petstore.duties;

public class JanitorialDuty extends Duty{
    public JanitorialDuty() {
        super("JanitorialDuty");
    }

    @Override
    public String performDuty() {
        return cleanUp();
    }

    private String cleanUp(){
        return getName() + " : all clean";
    }
}
