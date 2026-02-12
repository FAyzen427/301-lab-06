package com.example.listycity;

import java.util.Objects;

/**
 * This class represents a City with a city name and a province name.
 * It implements Comparable so cities can be sorted alphabetically by city name.
 */
public class City implements Comparable<City> {

    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province.
     */
    private String province;

    /**
     * Constructs a City with a given city name and province name.
     *
     * @param city     The name of the city
     * @param province The name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this City to another City based on city name
     *
     * @param other the City to compare with
     * @return negative if this city comes before,
     *         zero if equal,
     *         positive if after
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks if two City objects are equal based on city name and province.
     *
     * @param o the object to compare
     * @return true if both city and province match, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city) &&
                Objects.equals(province, other.province);
    }

    /**
     * Generates a hash code based on city and province.
     *
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
