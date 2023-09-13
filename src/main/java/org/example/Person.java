package org.example;

public class Person {
    private String name;
    private Integer age;
    private String gender;
    private String city;
    private String occupation;

    public Person() {
    }

    public Person(String name, Integer age, String gender, String city, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
