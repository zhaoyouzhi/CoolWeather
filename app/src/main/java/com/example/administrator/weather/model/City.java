package com.example.administrator.weather.model;

/**
 * Created by Administrator on 2016/7/5.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provindeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvindeId() {
        return provindeId;
    }

    public void setProvindeId(int provindeId) {
        this.provindeId = provindeId;
    }
}
