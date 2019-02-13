package com.lambdaschool.cities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class City
{
    private @Id @GeneratedValue Long id;
    private String name;
    private int homePrice;
    private int affordabilityIndex;

    public City()
    {
        // default constructor
    }

    public City(String name, int homePrice, int affordabilityIndex)
    {
        this.name = name;
        this.homePrice = homePrice;
        this.affordabilityIndex = affordabilityIndex;
    }
}
