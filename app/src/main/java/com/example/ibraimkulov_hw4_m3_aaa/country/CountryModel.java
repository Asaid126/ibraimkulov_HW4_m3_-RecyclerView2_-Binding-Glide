package com.example.ibraimkulov_hw4_m3_aaa.country;

public class CountryModel {
    private String flag;
    private String name;

    public CountryModel(String flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }
}