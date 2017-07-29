package com.boke.house.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Customer {
    private Integer id;
    private String name;
    private String phone;
    private String message;
    private Date visitTime;
}
