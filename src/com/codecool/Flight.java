package com.codecool;

import com.codecool.employee.FlightAttendant;
import com.codecool.employee.Pilot;

import java.util.*;

public class Flight {
    private UUID id;
    private Language language;
    private Set<FlightAttendant> flightAttendants;
    private Set<Pilot> pilots;
    private final int NEEDED_NUMBER_OF_FLIGHT_ATTENDANTS = 3;
    private final int NEEDED_NUMBER_OF_PILOTS = 3;

    public Flight( Language language) {
        this.id = UUID.randomUUID();
        this.language = language;
        this.flightAttendants = new HashSet<>();
        this.pilots = new HashSet<>();
    }

    public void addFlightAttendant(FlightAttendant flightAttendant) {
        flightAttendants.add(flightAttendant);
    }

    public void addPilots(Pilot pilot) {
        if (pilots.size() == 0) {
            pilots.add(pilot);
        }
        for (Pilot pilot1 : pilots) {
            if (pilot1.getPilotType() == pilot.getPilotType()){
                System.out.println("This type of pilot is already in the list");
            }
            else {pilots.add(pilot1);}
        }
    }

    public boolean checkPilotCompass(){
        for (Pilot pilot : pilots) {
            if(pilot.isAnalogCompass()) {
                return true;
            } else break;
        }
        return false;
    }

    public boolean checkFlightAttendantLanguage(){
        for (FlightAttendant flightAttendant : flightAttendants) {
            List<Language> knownLanguages = flightAttendant.getKnownLanguages();
            for (Language knownLanguage : knownLanguages) {
                if (knownLanguage == language){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCrewMembersNumber(){
        if (flightAttendants.size() == NEEDED_NUMBER_OF_FLIGHT_ATTENDANTS
                && pilots.size() == NEEDED_NUMBER_OF_PILOTS){
            return true;
        }
        return false;
    }
}
