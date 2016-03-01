package tiger.core.domain;

/**
 * Created by xy86 on 16-3-2.
 */
public class GdpDomain {
    private double gdpRealValue;

    private double gdpForecastValue;

    private double gdpGrowthRate;

    private double errorValue;

    private double gdpYearTarget;

    public double getGdpRealValue() {
        return gdpRealValue;
    }

    public void setGdpRealValue(double gdpRealValue) {
        this.gdpRealValue = gdpRealValue;
    }

    public double getGdpForecastValue() {
        return gdpForecastValue;
    }

    public void setGdpForecastValue(double gdpForecastValue) {
        this.gdpForecastValue = gdpForecastValue;
    }

    public double getGdpGrowthRate() {
        return gdpGrowthRate;
    }

    public void setGdpGrowthRate(double gdpGrowthRate) {
        this.gdpGrowthRate = gdpGrowthRate;
    }

    public double getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(double errorValue) {
        this.errorValue = errorValue;
    }

    public double getGdpYearTarget() {
        return gdpYearTarget;
    }

    public void setGdpYearTarget(double gdpYearTarget) {
        this.gdpYearTarget = gdpYearTarget;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public Long getIndustryType_id() {
        return industryType_id;
    }

    public void setIndustryType_id(Long industryType_id) {
        this.industryType_id = industryType_id;
    }

    private int  year;

    private int quarter;

    private Long industryType_id;

}
