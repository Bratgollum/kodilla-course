package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Tempratures;
import com.kodilla.testing.weather.stub.WeatherForcast;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForcastTestSuite {
    @Test
    public void testCalculateForecastWithMock(){
        //Given
        Tempratures tempraturesMock = mock(Tempratures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 26.2);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.1);
        when(tempraturesMock.getTempratures()).thenReturn(temperaturesMap);
        WeatherForcast weatherForcast = new WeatherForcast(tempraturesMock);

        //When
        int quantityOfSensors = weatherForcast.calculateForcast().size();

        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}
