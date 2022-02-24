package com.petstore.duties;

import java.util.HashMap;

public class AnimalCaregiver extends Duty{

    private String careGiverDuties() {
        HashMap<String, String> careGiverDuties = new HashMap<>();
        careGiverDuties.put("feeding", "animals were fed");
        careGiverDuties.put("grooming", "animals were groomed");
        careGiverDuties.put("training", "animals were trained");
        String careGiverDuty = "";
        for (int i = 0; i < careGiverDuties.size(); i++) {
            careGiverDuty = careGiverDuties.get(i);
        }
        return careGiverDuty;
    }

    public AnimalCaregiver(String name) {super(name);}

    @Override
    public String performDuty() {return careGiverDuties();}
}
