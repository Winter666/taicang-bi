/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain;

/**
 * Created by Bongo on 16/3/1.
 */
public class PowerGdpCorrelationDomain {

    //Domain测试: 忽略掉do层的id timestamp

    /**
     * 数据所属年份
     * */
    private int year;

    /**
     * 太仓市总GDP真实值
     * */
    private double realGdpValue;

    /**
     * 太仓市总GDP预测值
     * */
    private double forcastGdpValue;

    /**
     * 太仓市总工业用电量真实值
     * */
    private double realPowerValue;

    /**
     * 太仓市总工业用电量预测值
     * */
    private double forcastPowerValue;

    /**
     * @return year
     * */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return realGdpValue
     * */
    public double getRealGdpValue() {
        return realGdpValue;
    }

    /**
     * @param realGdpValue
     * */
    public void setRealGdpValue(double realGdpValue) {
        this.realGdpValue = realGdpValue;
    }

    /**
     * @return forcastGdpValue
     * */
    public double getForcastGdpValue() {
        return forcastGdpValue;
    }

    /**
     * @param forcastGdpValue
     * */
    public void setForcastGdpValue(double forcastGdpValue) {
        this.forcastGdpValue = forcastGdpValue;
    }

    /**
     * @return realPowerValue
     * */
    public double getRealPowerValue() {
        return realPowerValue;
    }

    /**
     * @param realPowerValue
     * */
    public void setRealPowerValue(double realPowerValue) {
        this.realPowerValue = realPowerValue;
    }

    /**
     * @return forcastPowerValue
     * */
    public double getForcastPowerValue() {
        return forcastPowerValue;
    }

    /**
     * @param forcastPowerValue
     * */
    public void setForcastPowerValue(double forcastPowerValue) {
        this.forcastPowerValue = forcastPowerValue;
    }

}
