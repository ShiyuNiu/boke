package com.boke.house.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ProductVO {

    public final static int TYPE_BLANK = 0; // 毛坯
    public final static String TYPE_BLANK_STR = "毛坯"; // 毛坯
    public final static int TYPE_SIMPLE = 1; // 简单装修
    public final static String TYPE_SIMPLE_STR = "简装修"; // 简单装修
    public final static int TYPE_COMPLEX = 2; // 精装修
    public final static String TYPE_COMPLEX_STR = "精装修"; // 精装修
    public final static int TYPE_OTHER = -1;
    public final static String TYPE_OTHER_STR = "其他";

    private Integer id;
    private String name;
    private String city;
    private String address;
    private Double price;
    private Double discount;
    private Date releaseTime;
    private Integer type;
    private String typeStr;
    private String summary;
    private String description;
    private Double area;
    private Date delivery;
    private Date opening;
    private String developer;
    private Double greenRate;
    private Double volumeRate;
}
