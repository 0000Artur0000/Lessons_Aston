package com.arzer0.lessons.lesson1.homework.airport.model;

import com.arzer0.lessons.lesson1.homework.airport.model.crews.CrewMember;

import java.util.List;
import java.util.Random;

public class Flight {
    private final String flightNumber;
    private final Plane plane;
    private final Airport departure;
    private Airport destination;
    private final List<CrewMember> crew;
    private boolean isCancelled = false;
    private Admin admin;


    public Flight(Plane plane, Airport departure, Airport destination, List<CrewMember> crew, Admin admin) {
        this.flightNumber = generateFlightNumber(departure, destination);
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
        this.crew = crew;
        this.admin = admin;
    }

    private String generateFlightNumber(Airport departure, Airport destination) {
        Random random = new Random();
        String departureInitial = departure.getName().substring(0, 1).toUpperCase();
        String destinationInitial = destination.getName().substring(0, 1).toUpperCase();
        int randomNumber = random.nextInt(900) + 100;
        return departureInitial + destinationInitial + randomNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public List<CrewMember> getCrew() {
        return crew;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void cancelFlight() {
        isCancelled = true;
        System.out.println("Рейс " + flightNumber + " отменен.");
    }

    public void changeDestination(Airport newDestination) {
        this.destination = newDestination;
        System.out.println("Рейс " + flightNumber + " перенаправлен в аэропорт " + newDestination.getName() + ".");
    }

    public void startFlight() {
        if (!departure.isWeatherGood()) {
            cancelFlight();
            return;
        }
        System.out.println("Рейс " + flightNumber + " успешно начат. Направление: " + destination.getName());
    }
}
