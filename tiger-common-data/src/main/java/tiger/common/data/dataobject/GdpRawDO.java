package tiger.common.data.dataobject;

/**
 * Created by xy86 on 16-3-1.
 */
public class GdpRawDO extends BaseDO {
    private double gdpRealValue;
    private double gdpGrowthRate;
    private int year;
    private int quarter;

    public double getGdpRealValue() {
        return gdpRealValue;
    }

    public void setGdpRealValue(double gdpRealValue) {
        this.gdpRealValue = gdpRealValue;
    }

    public double getGdpGrowthRate() {
        return gdpGrowthRate;
    }

    public void setGdpGrowthRate(double gdpGrowthRate) {
        this.gdpGrowthRate = gdpGrowthRate;
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

    private Long industryType_id;
}
