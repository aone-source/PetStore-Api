package com.petstore.duties;

import com.petstore.people.Employee;

import java.util.ArrayList;

public class ManagerialDuty <E> extends Duty {
    private ArrayList<E> employees;

    public ManagerialDuty() {super("ManagerialDuty");
    this.employees = new ArrayList<>();
    }

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
