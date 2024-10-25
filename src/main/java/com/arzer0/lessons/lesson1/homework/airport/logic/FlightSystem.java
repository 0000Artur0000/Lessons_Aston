package com.arzer0.lessons.lesson1.homework.airport.logic;

import com.arzer0.lessons.lesson1.homework.airport.model.*;
import com.arzer0.lessons.lesson1.homework.airport.model.crews.CrewMember;


import java.util.*;

public class FlightSystem {
    private static List<Flight> flights = new ArrayList<>();
    private static List<Admin> admins = new ArrayList<>();
    private static List<Plane> planes = new ArrayList<>();
    private static List<Airport> airports = new ArrayList<>();

    public static void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public static void addPlane(Plane plane) {
        planes.add(plane);
    }

    public static void addAirport(Airport airport) {
        airports.add(airport);
    }

    public static Flight createFlight(Plane plane, Airport departure, Airport destination, List<CrewMember> crew, Admin admin) {

        Flight flight = new Flight(plane, departure, destination, crew, admin);
        flights.add(flight);
        System.out.println("Администратор " + admin.getName() + " создал рейс " + flight.getFlightNumber() + ".");
        System.out.println("Экипаж:");
        for (CrewMember crewMember : crew) {
            System.out.println(" " + crewMember.getRole() + " " + crewMember.getName());
        }
        return flight;
    }

    public static void startFlight(Flight flight) {
        if (!flight.getDeparture().isWeatherGood() || !flight.getDestination().isWeatherGood()) {
            System.out.println("Администратор " + flight.getAdmin().getName() + ": Рейс не может быть совершён из-за плохих погодных условий.");
            cancelFlight(flight);
            return;
        }
        flight.startFlight();
    }

    public static void changeFlightDestination(Flight flight) {
        List<Airport> newAirports = new ArrayList<>(airports);
        newAirports.remove(flight.getDestination());
        Random random = new Random();
        flight.changeDestination(newAirports.get(random.nextInt(newAirports.size())));
    }

    public static void cancelFlight(Flight flight) {
        flight.cancelFlight();
    }


    public static Admin getRandomAdmin() {
        Random random = new Random();
        return admins.get(random.nextInt(admins.size()));
    }

    public static Plane getRandomPlane() {
        Random random = new Random();
        return planes.get(random.nextInt(planes.size()));
    }

    public static List<Airport> getRandomAirports() {
        Collections.shuffle(FlightSystem.airports);
        List<Airport> airports = new ArrayList<>();
        airports.add(FlightSystem.airports.get(0));
        airports.add(FlightSystem.airports.get(1));
        return airports;
    }

}
