package tiger.common.data.dataobject;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by lisite on 16-2-29.
 */
public class AirConditionDO extends BaseDO {

    private Date date;

    private int hour;

    private int day;

    private int month;

    private int year;

    private String flowDirection;

    private int flowLevel;

    private int humidity;

    private int rainfall;

    private int temperature;

    private Long air_monitor;

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

    public String getFlowDirection() {
        return flowDirection;
    }

    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }

    public int getFlowLevel() {
        return flowLevel;
    }

    public void setFlowLevel(int flowLevel) {
        this.flowLevel = flowLevel;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Long getAir_monitor() {
        return air_monitor;
    }

    public void setAir_monitor(Long air_monitor) {
        this.air_monitor = air_monitor;
    }

}
