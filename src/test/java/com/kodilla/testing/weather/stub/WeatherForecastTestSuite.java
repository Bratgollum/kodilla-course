package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForcastWithStub(){
        //Given
        Tempratures tempratures = new TempraturesStub();
        WeatherForcast weatherForcast = new WeatherForcast(tempratures);

        //When
        int quantityOfSensors = weatherForcast.calculateForcast().size();

        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}
