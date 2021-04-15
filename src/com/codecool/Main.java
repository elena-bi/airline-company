package com.codecool;

import com.codecool.employee.Pilot;
import com.codecool.employee.PilotType;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Flight flight = new Flight(Language.ENGLISH);
        Pilot pilot = new Pilot("Nume", "10/2/1985", PilotType.PILOT);

        flight.addPilots(pilot);
        flight.addPilots(pilot);

        if (flight.checkCrewMembersNumber() == false) {
            System.out.println("There aren't enough crew members");
        }

        if (flight.checkFlightAttendantLanguage() == false) {
            System.out.println("There is not a flight attendance able to speak the flight's language");
        }

        if (flight.checkPilotCompass() == false) {
            System.out.println("The pilots do not own a compass");
        }
    }
}
