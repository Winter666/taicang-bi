package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class WaterQualityDO extends BaseDO {

    private Date date;

    private int hour;

    private int day;

    private int month;

    private int year;

    private double kmno4;

    private double nh4n;

    private double o2;

    private double p;

    private double tn;

    private Long water_monitor;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
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

    public double getKmno4() {
        return kmno4;
    }

    public void setKmno4(double kmno4) {
        this.kmno4 = kmno4;
    }

    public double getNh4n() {
        return nh4n;
    }

    public void setNh4n(double nh4n) {
        this.nh4n = nh4n;
    }

    public double getO2() {
        return o2;
    }

    public void setO2(double o2) {
        this.o2 = o2;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getTn() {
        return tn;
    }

    public void setTn(double tn) {
        this.tn = tn;
    }

    public Long getWater_monitor() {
        return water_monitor;
    }

    public void setWater_monitor(Long water_monitor) {
        this.water_monitor = water_monitor;
    }
}
