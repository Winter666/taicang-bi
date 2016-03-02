/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject;

/**
 * Created by Bongo on 16/3/2.
 */
public class PowerGdpCorrelationIndustryDO extends BaseDO
                 implements Comparable<PowerGdpCorrelationIndustryDO>{

    private int year;

    private int season;

    private int industryId;

    private double realIndustryPower;

    private double forcastIndustryPower;

    private double realIndustryGdp;

    private double forcastIndustryGdp;

    public double getForcastIndustryPower() {
        return forcastIndustryPower;
    }

    public void setForcastIndustryPower(double forcastIndustryPower) {
        this.forcastIndustryPower = forcastIndustryPower;
    }

    public double getRealIndustryGdp() {
        return realIndustryGdp;
    }

    public void setRealIndustryGdp(double realIndustryGdp) {
        this.realIndustryGdp = realIndustryGdp;
    }

    public double getForcastIndustryGdp() {
        return forcastIndustryGdp;
    }

    public void setForcastIndustryGdp(double forcastIndustryGdp) {
        this.forcastIndustryGdp = forcastIndustryGdp;
    }

    public double getRealIndustryPower() {
        return realIndustryPower;
    }

    public void setRealIndustryPower(double realIndustryPower) {
        this.realIndustryPower = realIndustryPower;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(PowerGdpCorrelationIndustryDO target){

        int thisYear = this.getYear();

        int thisId = this.getIndustryId();

        int targetYear = target.getYear();

        int targetId = target.getIndustryId();

        if(thisYear>targetYear)
            return 1;
        else if(thisYear<targetYear)
            return -1;
        else{
            if (thisId>targetId) return 1;
            else return -1;
        }
    }

}
