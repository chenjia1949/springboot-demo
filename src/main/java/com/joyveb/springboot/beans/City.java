package com.joyveb.springboot.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * `id` varchar(10) NOT NULL,
 * `province_id` varchar(10) DEFAULT NULL,
 * `city_name` varchar(10) DEFAULT NULL,
 * `description` varchar(10) DEFAULT NULL,
 */
@Data
public class City implements Serializable {
    private String id;
    private String provinceId;
    private String cityName;
    private String description;

    public City() {
    }

    public City(String id, String provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }
}
