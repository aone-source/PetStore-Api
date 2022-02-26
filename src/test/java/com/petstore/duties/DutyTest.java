package com.petstore.duties;
import com.petstore.people.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class DutyTest {

    @Test
    public void performDutyTest(){
        //Given
        ArrayList<Duty> duties = new ArrayList<>();
        Stocker stocker1 = new Stocker();
        duties.add(stocker1);
        Employee tariq = new Employee ("Tariq Hook", 43,"tariq@petstore.con", duties);
        String expected = "Stocker : all stocked";
        String actual = tariq.performDuty(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void performAllDutyTest(){
        //Given
        ArrayList<Duty> duties = new ArrayList<>();
        Manager manager1 = new Manager();
        Stocker stocker1 = new Stocker();

        duties.add(manager1);
        duties.add(stocker1);
        Employee tariq = new Employee ("Tariq Hook", 43,"tariq@petstore.con", duties);
        String expected = "Duties performed:\nManager : open store\nManager : schedules are made\nManager : close store" +
                "\nStocker : all stocked";
        String actual = tariq.performAllDuties();
        Assertions.assertEquals(expected, actual);
    }
}
