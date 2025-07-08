package com.cognizant.springlearn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountryList {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryList.class);

    private List<Country> countries;

    public CountryList() {
        LOGGER.debug("Inside CountryList Constructor");
    }

    public List<Country> getCountries() {
        LOGGER.debug("Inside getCountries()");
        return countries;
    }

    public void setCountries(List<Country> countries) {
        LOGGER.debug("Inside setCountries()");
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountryList [countries=" + countries + "]";
    }
}
