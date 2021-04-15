package com.codecool.employee;

import java.util.Objects;

public class Pilot extends Employee{
    private PilotType pilotType;
    private boolean analogCompass;


    public Pilot(String name, String birthDate, PilotType pilotType) {
        super(name, birthDate);
        this.pilotType = pilotType;
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public boolean isAnalogCompass() {
        return analogCompass;
    }

    public boolean canAttendMoreThanOneFLight(){
        if(pilotType.equals("co-pilot")) {
            return true;
        }
        return false;
    }

    public void giveAnalogCompass(){
        analogCompass = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pilot)) return false;
        Pilot pilot = (Pilot) o;
        return pilotType == pilot.pilotType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pilotType);
    }
}
