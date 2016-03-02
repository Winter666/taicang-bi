package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class WaterConditionDO extends BaseDO {

    private Date date;

    private int hour;

    private int day;

    private int month;

    private int year;

    private double waterLevelDown;

    private double waterLevelUp;

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

    public double getWaterLevelDown() {
        return waterLevelDown;
    }

    public void setWaterLevelDown(double waterLevelDown) {
        this.waterLevelDown = waterLevelDown;
    }

    public double getWaterLevelUp() {
        return waterLevelUp;
    }

    public void setWaterLevelUp(double waterLevelUp) {
        this.waterLevelUp = waterLevelUp;
    }

    public Long getWater_monitor() {
        return water_monitor;
    }

    public void setWater_monitor(Long water_monitor) {
        this.water_monitor = water_monitor;
    }

}
