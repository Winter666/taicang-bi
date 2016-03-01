package tiger.common.data.dataobject;

/**
 * Created by xy86 on 16-2-28.
 */
public class TaxForecastDO extends BaseDO {
    private double taxRealValue;

    private double taxForecastValue;

    private double taxGrowthRate;

    public void setTaxRealValue(double taxRealValue) {
        this.taxRealValue = taxRealValue;
    }

    public void setTaxForecastValue(double taxForecastValue) {
        this.taxForecastValue = taxForecastValue;
    }

    public void setTaxGrowthRate(double taxGrowthRate) {
        this.taxGrowthRate = taxGrowthRate;
    }

    public void setErrorValue(double errorValue) {
        this.errorValue = errorValue;
    }

    public void setTaxYearTarget(double taxYearTarget) {
        this.taxYearTarget = taxYearTarget;
    }

    public void setYear(int year) {
        this.year = year;
    }



    private double errorValue;
    private double taxYearTarget;

    private int  year;

    private int month;

    public void setMonth(int month) {
        this.month = month;
    }

    public void setFixedAssetsInvestment(double fixedAssetsInvestment) {
        this.fixedAssetsInvestment = fixedAssetsInvestment;
    }

    public void setFiscalOut(double fiscalOut) {
        this.fiscalOut = fiscalOut;
    }

    public void setGdpValue(double gdpValue) {
        this.gdpValue = gdpValue;
    }

    public void setForeignTrade(double foreignTrade) {
        this.foreignTrade = foreignTrade;
    }

    private double fixedAssetsInvestment;
    private double fiscalOut;
    private double gdpValue;

    public int getMonth() {
        return month;
    }

    public double getFixedAssetsInvestment() {
        return fixedAssetsInvestment;
    }

    public double getFiscalOut() {
        return fiscalOut;
    }

    public double getGdpValue() {
        return gdpValue;
    }

    public double getForeignTrade() {
        return foreignTrade;
    }

    private double foreignTrade;
    public double getTaxRealValue() {
        return taxRealValue;
    }

    public double getTaxForecastValue() {
        return taxForecastValue;
    }

    public double getTaxGrowthRate() {
        return taxGrowthRate;
    }

    public double getErrorValue() {
        return errorValue;
    }

    public double getTaxYearTarget() {
        return taxYearTarget;
    }

    public int getYear() {
        return year;
    }






}
