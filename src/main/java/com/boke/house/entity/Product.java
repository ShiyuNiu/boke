package com.boke.house.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer id;
    private String name;
    private String city;
    private String address;
    private Double price;
    private Double discount;
    private Date releaseTime;
    private Integer type;
    private String summary;
    private String description;
    private Double area;
    private Date delivery;
    private Date opening;
    private String developer;
    private Double greenRate;
    private Double volumeRate;
}
