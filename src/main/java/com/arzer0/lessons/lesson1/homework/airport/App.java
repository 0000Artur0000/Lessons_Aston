package com.arzer0.lessons.lesson1.homework.airport;

import com.arzer0.lessons.lesson1.homework.airport.logic.FlightSystem;
import com.arzer0.lessons.lesson1.homework.airport.model.*;
import com.arzer0.lessons.lesson1.homework.airport.model.crews.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        FlightSystem.addAdmin(new Admin("Андрей Борисов"));
        FlightSystem.addAdmin(new Admin("Ольга Павлова"));

        FlightSystem.addPlane(new Plane("Boeing 737", 180, 5000));
        FlightSystem.addPlane(new Plane("Airbus A320", 200, 6000));

        FlightSystem.addAirport(new Airport("Шереметьево", "Москва", true));
        FlightSystem.addAirport(new Airport("Домодедово", "Москва", true));
        FlightSystem.addAirport(new Airport("JFK", "Нью-Йорк", true));
        FlightSystem.addAirport(new Airport("Хитроу", "Лондон", false));

        List<CrewMember> crew = Arrays.asList(
                new Pilot("Иван Иванов"),
                new Navigator("Петр Петров"),
                new RadioOperator("Сергей Сергеев"),
                new Stewardess("Мария Смирнова"),
                new Stewardess("Елена Алексеева")
        );


        Admin admin = FlightSystem.getRandomAdmin();
        Plane plane = FlightSystem.getRandomPlane();
        List<Airport> airports = FlightSystem.getRandomAirports();
        Airport departure = airports.get(0);
        Airport destination = airports.get(1);

        Flight flight = FlightSystem.createFlight(plane, departure, destination, crew, admin);
        FlightSystem.startFlight(flight);

        Random random = new Random();
        if (random.nextBoolean())
            FlightSystem.changeFlightDestination(flight);

    }
}