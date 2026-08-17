package org.example;

import java.util.Arrays;

public class WeatherStation {
    public static void main(String[] args) {

        if (args.length == 0) {
            return;
        }

        int number;

        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException numberFormatException){
            return;
        }

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (number >= 86400) {
            number -= 86400;
            days++;
        }
        while (number >= 3600) {
            number -= 3600;
            hours++;
        }
        while (number >= 60) {
            number -= 60;
            minutes++;
        }
        if (number > 0) {
            seconds += number;
        }

        System.out.println(days + " Days\n" + hours + " Hours\n" + minutes + " Minutes\n" + seconds + " Seconds");
    }
}
