package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class WaterIndustryDO extends BaseDO {

    private Date date;

    private int day;

    private int month;

    private int year;

    private double discharge;

    private Long water_industry;

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

    public Long getWater_industry() {
        return water_industry;
    }

    public void setWater_industry(Long water_industry) {
        this.water_industry = water_industry;
    }
}
