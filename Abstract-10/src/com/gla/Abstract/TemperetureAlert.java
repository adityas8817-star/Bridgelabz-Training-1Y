package com.gla.Abstract;
import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double temperature = 38.5;
        double threshold = 35.0;
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        if (isHighTemp.test(temperature)) {
            System.out.println(" Alert! Temperature is too high: " + temperature + "°C");
        } else {
            System.out.println("Temperature is normal: " + temperature + "°C");
        }
    }
}