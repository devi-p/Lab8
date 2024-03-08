package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import android.content.ContentValues;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {


    private CustomList list;
    /**
     * create a mock list for my city list
     * *@return
     *
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList< >());
        return list;
    }

    @Test
     public void addCityTest(){
        list = MockCityList();
        int listSize=list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City cityToAdd = new City("Estevan", "SK");
        list.addCity(cityToAdd);
        assertTrue(list.hasCity(cityToAdd));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City cityToAdd = new City("Estevan", "SK");
        list.addCity(cityToAdd);
        int initialCount = list.getCount();
        list.deleteCity(cityToAdd);
        assertEquals(initialCount - 1, list.getCount());
    }

    public void countCitiesTest() {
        list = MockCityList();
        City city1 = new City("Estevan", "SK");
        City city2 = new City("Edmonton", "AB");
        list.addCity(city1);
        list.addCity(city2);
        int initialCount = list.getCount();
        assertEquals(initialCount, list.countCities());
    }

}