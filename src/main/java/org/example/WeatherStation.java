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

        System.out.println(secondsConvert(number));
    }

    static String secondsConvert(int number) {
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        days = number / 86400;
        number = number % 86400;

        hours = number / 3600;
        number = number % 3600;

        minutes = number / 60;
        number = number % 60;

        if (number > 0) {
            seconds += number;
        }

        String output = days + " Days\n" + hours + " Hours\n" + minutes + " Minutes\n" + seconds + " Seconds";
        return output;
    }
}
