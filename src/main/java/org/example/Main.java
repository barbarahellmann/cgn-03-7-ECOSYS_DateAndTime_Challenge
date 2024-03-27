package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

       // Formatierung
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");

        // Aktuelle Zeit

        String formattedToday = LocalDate.now().format(formatter);
        System.out.println("Aktuelle Zeit: " + formattedToday);


        // Heute in 2 Wochen
        LocalDate twoWeeksAhead = LocalDate.now().plusDays(14);

        String formattedTwoWeeksAhead = twoWeeksAhead.format(formatter);
        System.out.println("In zwei Wochen: " + formattedTwoWeeksAhead);

        System.out.println("-----------------");
        System.out.println("");

        // Vergleiche heute mit in 2 Wochen
        LocalDate start = LocalDate.now();
        LocalDate end = twoWeeksAhead;

        long daysBetween = ChronoUnit.DAYS.between(start, end);

        if(start.isBefore(end)) {
        System.out.println("Das Random Datum liegt " + daysBetween + " Tage vor dem " + start);
        } else {
            System.out.println("Das Random Datum liegt " + daysBetween + " Tage nach dem " + start);
        }

        System.out.println("-----------------");
        System.out.println("");


        // Vergleicht mit einem Random date
        Random random = new Random();
        int zufallzahl = random.nextInt(100);
        LocalDate end2 = LocalDate.now().plusDays(zufallzahl);

        long daysBetween2 = ChronoUnit.DAYS.between(start, end2);

        if(start.isBefore(end2)) {
            System.out.println("Das Datum " + end2 + " liegt " + daysBetween2 + " Tage vor dem " + start);
        } else {
            System.out.println("Das Datum " + end2 + " liegt " + daysBetween2 + " Tage nach dem " + start);
        }


    }
}