package com.petstore.duties;

public abstract class Duty {

    private String name;

    public Duty(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract String  performDuty();

}
