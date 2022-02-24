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
        return openStore();
    }

    private String openStore(){return getName() + " : open store";}

    private String makeSchedules(){return getName() + " : schedules are made";}

    public void hireEmployee(E employee) {
        employees.add(employee);
    }

    private void fireEmployees(E employee){employees.remove(employee);}

    private String closeStore(){return getName() + " : close store";}
}
