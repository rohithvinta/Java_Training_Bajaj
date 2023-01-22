package com.dayfour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        List<PersonComparator> people = Arrays.asList(
            new PersonComparator("Jaideep", "Sai"),
            new PersonComparator("Rohith", "Vinta"),
            new PersonComparator("Michael", "Jackson")
        );

        people.sort(new Comparator<PersonComparator>() {
            @Override
            public int compare(PersonComparator p1, PersonComparator p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        for (PersonComparator p : people) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}