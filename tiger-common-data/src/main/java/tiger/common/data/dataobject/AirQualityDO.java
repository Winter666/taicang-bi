package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class AirQualityDO extends BaseDO {

    private Date date;

    private int hour;

    private int day;

    private int month;

    private int year;

    private double aqi;

    private double airQualityLevel;

    private String firstElement;

    private double co;

    private double no2;

    private double o3;

    private double pm10;

    private double pm25;

    private double so2;

    private int air_monitor;

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

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public double getAqi() {
        return aqi;
    }

    public void setAqi(double aqi) {
        this.aqi = aqi;
    }

    public double getAirQualityLevel() {
        return airQualityLevel;
    }

    public void setAirQualityLevel(double airQualityLevel) {
        this.airQualityLevel = airQualityLevel;
    }

    public String getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(String firstElement) {
        this.firstElement = firstElement;
    }

    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public int getAir_monitor() {
        return air_monitor;
    }

    public void setAir_monitor(int air_monitor) {
        this.air_monitor = air_monitor;
    }
}
