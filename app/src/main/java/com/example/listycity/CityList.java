package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class manages a list of City objects.
 * It allows adding, deleting, checking, counting,
 * and retrieving sorted cities.
 */
public class CityList {

    /**
     * The list that stores City objects.
     */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     *
     * @param city the City to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities (alphabetically by city name).
     *
     * @return a sorted list of cities
     */
    public List<City> getCities() {
        List<City> sortedList = new ArrayList<>(cities);
        Collections.sort(sortedList);
        return sortedList;
    }

    /**
     * Checks whether a given city exists in the list.
     *
     * @param city the City to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     *
     * @param city the City to delete
     * @throws IllegalArgumentException if the city does not exist
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     *
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
