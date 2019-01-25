package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForcast {
    Tempratures tempratures;

    public WeatherForcast(Tempratures tempratures) {
        this.tempratures = tempratures;
    }
    public HashMap<Integer, Double> calculateForcast(){
        HashMap<Integer , Double> resultMap = new HashMap<Integer, Double>();
           for(Map.Entry<Integer,Double> temprature :
            tempratures.getTempratures().entrySet()){

                // adding 1 celcius degree to current value
                // as a temprorary weather forcast
                resultMap.put(temprature.getKey(), temprature.getValue() + 1);
        }
           return resultMap;
    }
}
