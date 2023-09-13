package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bob", 30, "Male", "London", "Accountant"));
        persons.add(new Person("Alice", 25, "Female", "New york", "Software Engineer"));
        persons.add(new Person("Charlie", 35, "Male", "San Francisco", "Doctor"));
        persons.add(new Person("David", 40, "Male", "Paris", "Lawyer"));
        persons.add(new Person("Eve", 45, "Female", "Tokyo", "Architect"));
        persons.add(new Person("Frank", 28, "Male", "London", "Teacher"));
        persons.add(new Person("Grace", 38, "Female", "New york", "Data Scientist"));
        persons.add(new Person("Henry", 32, "Male", "San Francisco", "Engineer"));
        persons.add(new Person("Lvy", 42, "Female", "Paris", "Artists"));
        persons.add(new Person("Jack", 50, "Male", "Tokyo", "BusinessMan"));


        // names of all female

        List<String> femaleNames = persons.stream()
                .filter((p) -> p.getGender().equals("Female"))
                .map((p) -> p.getName())
                .collect(Collectors.toList());
        System.out.println("names of all female are : " + femaleNames);

        ///////


        // average age of people in london

        double londonAverageAge = persons.stream()
                .filter((p) -> p.getCity().equals("London"))
                .mapToInt((p) -> p.getAge())
                .average()
                .getAsDouble();
        System.out.println("average age of people in london is : " + londonAverageAge);

        ///////


        // occupation of people older than 35

        List<String> occupation = persons.stream()
                .filter((p) -> p.getAge() >= 35)
                .map((p) -> p.getOccupation())
                .collect(Collectors.toList());
        System.out.println("occupation of people older than 35 is : " + occupation);

        ////////


        // names of the first two people in the list

        List<String> nameOfTheFirstTwoPeople = persons
                .subList(0, 2)
                .stream()
                .map((p) -> p.getName())
                .collect(Collectors.toList());
        System.out.println("names of the first two people in the list are : " + nameOfTheFirstTwoPeople);

        ///////


        // the oldest persons age

        int maxOfAll = persons.stream()
                .mapToInt((p) -> p.getAge())
                .max()
                .getAsInt();
        System.out.println("the oldest persons age is : " + maxOfAll);

        ///////


        // check if there is any person whose occupation is "teacher"

        boolean teacherHas = persons.stream()
                .anyMatch((p) -> p.getOccupation().equals("Teacher"));
        System.out.println("check if there is any person whose occupation is teacher is: " + teacherHas);

        ///////


        // names of people in paris sorted in reverse alphabetical order

        List<String> reversParis = persons.stream()
                .filter((p) -> p.getCity().equals("Paris"))
                .map((p) -> p.getName())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("names of people in paris sorted in reverse alphabetical order are : " + reversParis);

        ///////


        // number of males in the list of people

        long maleCount = persons.stream()
                .filter((p) -> p.getGender().equals("Male"))
                .count();
        System.out.println("number of males in the list of people is : " + maleCount);

        ///////


        // names of people who are between 30 and 40 years old (inclusive)

        List<String> collectAge = persons.stream()
                .filter((p) -> p.getAge() >= 30 && p.getAge() <= 40)
                .map((p) -> p.getName())
                .collect(Collectors.toList());
        System.out.println("names of people who are between 30 and 40 years old are : " + collectAge);

        ////////


        // check if all people in the list have a city value assigned

        boolean cityIsNull = persons.stream()
                .anyMatch((p) -> p.getCity() == null);
        System.out.println("check if all people in the list have a city value assigned is : " + cityIsNull);

        ///////


        // check if any persons name ends with "y"

        boolean yEndName = persons.stream()
                .anyMatch((p) -> p.getName().endsWith("y"));
        System.out.println("check if any persons name ends with y is : " + yEndName);

        ////////


        // maximum age among people younger than 40

        int maxOfYounger = persons.stream()
                .mapToInt((p) -> p.getAge())
                .max()
                .getAsInt();
        System.out.println("maximum age among people younger than 40 is : " + maxOfYounger);

        ///////


        // occupations of people whose names start with the letter "A"

        List<String> nameStartA = persons.stream()
                .filter((p) -> p.getName().startsWith("A"))
                .map((p) -> p.getOccupation())
                .collect(Collectors.toList());
        System.out.println("occupations of people whose names start with the letter A are : " + nameStartA);

        ////////


        // create a comma-separated string of all unique cities in the list

        String collectCities = persons.stream()
                .map((p) -> p.getCity())
                .distinct()
                .collect(Collectors.joining(" , "));
        System.out.println("comma-separated string of all unique cities in the list isl : " + collectCities);
    }
}