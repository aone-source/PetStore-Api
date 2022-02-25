package com.petstore.people;

import com.petstore.duties.Duty;

import java.util.ArrayList;

public class Employee extends Person {
    private ArrayList<Duty> duties;

    public Employee(String fullName, Integer age, String email, ArrayList<Duty> duties) {
        super(fullName, age, email);
        this.duties = duties;
    }

    public ArrayList<Duty> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<Duty> duties) {
        this.duties = duties;
    }

    public String performDuty(int index){
        String output = duties.get(index).performDuty();
        return output;
    }

    public String performAllDuties(){
        StringBuilder builder = new StringBuilder();
        builder.append("Duties performed:\n");
        for (Duty duty:duties){
            builder.append(duty.performDuty()+"\n");
        }
        return builder.toString().trim();
    }

    @Override
    public String toString() {
        return "Employee: " + getFullName() +
                ", Duties: " + duties;
    }
}

