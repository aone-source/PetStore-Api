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
        JanitorialDuty janitorialDuty = new JanitorialDuty();
        duties.add(janitorialDuty);
        Employee janitor = new Employee ("Ashley", 48,"ashley@petstore.con", duties);
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
        Employee janitor = new Employee ("Ashley", 48,"ashley@petstore.com", duties);
        String expected = "Duties performed:\nJanitorialDuty : all clean\nManagerialDuty : open store";
        String actual = janitor.performAllDuties();
        Assertions.assertEquals(expected, actual);
    }
}
