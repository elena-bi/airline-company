package com.codecool.employee;

import com.codecool.Language;

import java.util.ArrayList;
import java.util.List;

public class FlightAttendant extends Employee{
    private List<Language> knownLanguages;

    public FlightAttendant(String name, String birthDate) {
        super(name, birthDate);
        this.knownLanguages = new ArrayList<>();
    }

    public List<Language> getKnownLanguages() {
        return knownLanguages;
    }

    public void addKnownLanguages(Language language) {
        knownLanguages.add(language);
    }
}
