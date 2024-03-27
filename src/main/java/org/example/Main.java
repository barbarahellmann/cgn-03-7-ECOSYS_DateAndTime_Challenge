package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

        // Vergleiche heute mit in 2 Wochen
        LocalDate start = LocalDate.now();
        LocalDate end = twoWeeksAhead;

        long daysBetween = ChronoUnit.DAYS.between(start, end);

        if(daysBetween > 0) {
        System.out.println("Datum liegt " + daysBetween + " Tage vor dem " + start);
        } else {
            System.out.println("Datum liegt " + daysBetween + " Tage nach dem " + start);
        }

    }
}