package com.petstore.people;

public abstract class Person {
    private String fullName;
    private Integer age;
    private String email;
    private static Integer idIndex = 1;
    private final Integer id;

    Person(String fullName, Integer age, String email){
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.id = idIndex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void setIdIndex(Integer update) {
        idIndex  = update;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + '\'' +
                ", email:" + email + '\'' +
                ", id: " + id;
    }
}

