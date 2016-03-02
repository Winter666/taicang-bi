package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class AirPollutionDO extends BaseDO {

    private Date date;

    private int day;

    private int month;

    private int year;

    private double discharge;

    private double no;

    private double smoke;

    private double so2;

    private Long air_pollution_source;

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

    public double getNo() {
        return no;
    }

    public void setNo(double no) {
        this.no = no;
    }

    public double getSmoke() {
        return smoke;
    }

    public void setSmoke(double smoke) {
        this.smoke = smoke;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public Long getAir_pollution_source() {
        return air_pollution_source;
    }

    public void setAir_pollution_source(Long air_pollution_source) {
        this.air_pollution_source = air_pollution_source;
    }
}
