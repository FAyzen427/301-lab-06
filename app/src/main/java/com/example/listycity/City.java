package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * This constructs a City with a city name and province name.
     * @param city The city name
     * @param province The province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     * @return province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares two City objects by city name (lexicographically).
     * @param other the other City
     * @return comparison result
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }
}
