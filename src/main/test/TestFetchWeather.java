package com.example.weatherapp;

import com.example.weatherapp.WeatherFetch;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestWeatherFetch {
    @Test
    public void testFetchWeather() {
        try {
            double latitude = 40.7128;
            double longitude = -74.0060;
            JSONObject weatherData = WeatherFetch.fetchWeather(latitude, longitude);
            assertNotNull(weatherData);
            assertEquals(weatherData.getDouble("lat"), latitude, 0.1);
            assertEquals(weatherData.getDouble("lon"), longitude, 0.1);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCityStateToLatLon() {
        try {
            double latitude = 42.3554334;
            double longitude = -71.060511;
            double[] weatherLatLon = WeatherFetch.cityStateToLatLon("Boston", "MA");
            assertNotNull(weatherLatLon);
            assertEquals(weatherLatLon[0], latitude, 0.1);
            assertEquals(weatherLatLon[1], longitude, 0.1);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFetchLocation() {
        try {
            double latitude = 42.3554334;
            double longitude = -71.060511;
            JSONObject weatherData = WeatherFetch.fetchLocation("Boston", "MA");
            assertNotNull(weatherData);
            assertEquals(weatherData.getDouble("lat"), latitude, 0.1);
            assertEquals(weatherData.getDouble("lon"), longitude, 0.1);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }



}