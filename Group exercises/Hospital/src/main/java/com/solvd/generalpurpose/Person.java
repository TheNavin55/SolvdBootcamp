package com.solvd.generalpurpose;

import com.solvd.enums.Gender;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String telNumber;
    private Address address;
    private Gender gender;
}
