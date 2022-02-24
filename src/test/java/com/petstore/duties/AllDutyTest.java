package com.petstore.duties;

import com.petstore.people.Employee;
import com.petstore.people.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AllDutyTest {

    @Test
    public void performDutyTest(){
        //Given
        ArrayList<Duty> duties = new ArrayList<>();
        JanitorialDuty janitorialDuty = new JanitorialDuty();
        duties.add(janitorialDuty);
        Employee janitor = new Employee ("Bob", 45,"bob@petshop.com", duties);
        String expected = "JanitorialDuty : all clean";
        String actual = janitor.performDuty(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void performAllDutyTest(){
        //Given
        ArrayList<Duty> duties = new ArrayList<>();
        JanitorialDuty janitorialDuty = new JanitorialDuty();
        ManagerialDuty managerialDuty = new ManagerialDuty();
        duties.add(janitorialDuty);
        duties.add(managerialDuty);
        Employee janitor = new Employee ("Bob", 45,"bob@petshop.com", duties);
        String expected = "Duties performed:\nJanitorialDuty : all clean\nManagerialDuty : open store";
        String actual = janitor.performAllDuties();
        Assertions.assertEquals(expected, actual);
    }

}
