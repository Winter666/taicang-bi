/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject;

/**
 * Created by Bongo on 16/3/4.
 */
public class PowerGdpCorrelationEnterpriseSoloDO extends BaseDO
                implements Comparable<PowerGdpCorrelationEnterpriseSoloDO>{

    private int year;

    private int season;

    private int enterpriseId;

    private double realEnterprisePower;

    private double forcastEnterprisePower;

    private double realEnterpriseGdp;

    private double forcastEnterpriseGdp;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public double getRealEnterprisePower() {
        return realEnterprisePower;
    }

    public void setRealEnterprisePower(double realEnterprisePower) {
        this.realEnterprisePower = realEnterprisePower;
    }

    public double getForcastEnterprisePower() {
        return forcastEnterprisePower;
    }

    public void setForcastEnterprisePower(double forcastEnterprisePower) {
        this.forcastEnterprisePower = forcastEnterprisePower;
    }

    public double getRealEnterpriseGdp() {
        return realEnterpriseGdp;
    }

    public void setRealEnterpriseGdp(double realEnterpriseGdp) {
        this.realEnterpriseGdp = realEnterpriseGdp;
    }

    public double getForcastEnterpriseGdp() {
        return forcastEnterpriseGdp;
    }

    public void setForcastEnterpriseGdp(double forcastEnterpriseGdp) {
        this.forcastEnterpriseGdp = forcastEnterpriseGdp;
    }

    /**
     * @param target
     * sorted according year->industryId->season
     * 最终排序结果和数据库初始顺序有关系????????????????????????????????后面回来看看
     * */
    @Override
    public int compareTo(PowerGdpCorrelationEnterpriseSoloDO target){

        int thisYear = this.getYear();

        int thisId = this.getEnterpriseId();

        int targetYear = target.getYear();

        int targetId = target.getEnterpriseId();

        int targetSeason =target.getSeason();

        int thisSeason = this.getSeason();

        /*
        * ......留待抽取
        * */
        if(thisYear>targetYear)
            return 1;
        else if(thisYear<targetYear)
            return -1;
        else{
            if (thisId>targetId) return 1;
            else if(thisId<targetId)return -1;
            else if(thisSeason>targetSeason) return 1;
            else return -1;
        }
    }

}
