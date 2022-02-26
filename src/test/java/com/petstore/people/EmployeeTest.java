package com.petstore.people;
import com.petstore.duties.Duty;
import com.petstore.duties.Manager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;


public class EmployeeTest {

    @BeforeEach
    public void setUp (){
        Employee.setIdIndex(0);
    }

    @Test
    public void constructorTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        String expected = "Employee: Yennifer Campos, Duties: [Manager]";
        String actual = employee.toString();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        String expected = "Yennifer Campos";
        String actual = employee.getFullName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        String expected = "Yennifer Campos";
        employee.setFullName("Yennifer Campos");
        String actual = employee.getFullName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getAgeTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        Integer expected = 25;
        Integer actual = employee.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setAgeTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        Integer expected = 25;
        employee.setAge(25);
        Integer actual = employee.getAge();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void getEmailTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        String expected = "yennifer@petstore.com";
        String actual = employee.getEmail();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void setEmailTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        String expected = "yennifer@petstore.com";
        employee.setEmail("yennifer@petstore.com");
        String actual = employee.getEmail();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void getDutiesTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        ArrayList expected = duties;
        ArrayList actual = employee.getDuties();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setDutiesTest() {
        Manager manager = new Manager();
        ArrayList<Duty> duties = new ArrayList<>();
        duties.add(manager);

        Employee employee = new Employee("Yennifer Campos", 25,"yennifer@petstore.com",duties);

        ArrayList expected = duties;
        employee.setDuties(duties);
        ArrayList actual = employee.getDuties();

        Assertions.assertEquals(expected,actual);
    }
}


