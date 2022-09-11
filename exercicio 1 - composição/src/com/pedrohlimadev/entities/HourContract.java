package com.pedrohlimadev.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHouer;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHouer, Integer hours) {
        this.date = date;
        this.valuePerHouer = valuePerHouer;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHouer() {
        return valuePerHouer;
    }

    public void setValuePerHouer(Double valuePerHouer) {
        this.valuePerHouer = valuePerHouer;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }


    public double totalValue() {
        return valuePerHouer * hours;
    }
}
