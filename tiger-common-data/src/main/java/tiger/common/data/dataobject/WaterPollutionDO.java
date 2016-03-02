package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class WaterPollutionDO extends BaseDO {

    private Date date;

    private int day;

    private int month;

    private int year;

    private double discharge;

    private double cod;

    private double nh4n;

    private double p;

    private Long water_pollution_source;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDischarge() {
        return discharge;
    }

    public void setDischarge(double discharge) {
        this.discharge = discharge;
    }

    public double getCod() {
        return cod;
    }

    public void setCod(double cod) {
        this.cod = cod;
    }

    public double getNh4n() {
        return nh4n;
    }

    public void setNh4n(double nh4n) {
        this.nh4n = nh4n;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public Long getWater_pollution_source() {
        return water_pollution_source;
    }

    public void setWater_pollution_source(Long water_pollution_source) {
        this.water_pollution_source = water_pollution_source;
    }
}
