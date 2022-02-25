package com.petstore.duties;

public class AnimalCaregiver extends Duty{

    public AnimalCaregiver() {super("AnimalCaregiver");}

    @Override
    public String performDuty() {
        StringBuilder output = new StringBuilder();
        output.append(feeding() + "\n");
        output.append(grooming() + "\n");
        output.append(training() + "\n");

        return output.toString().trim();
    }

    private String feeding(){return getName() + " : animals were fed";}

    private String grooming(){return getName() + " : animals were groomed";}

    private String training(){return getName() + " : animals were trained";}
}
