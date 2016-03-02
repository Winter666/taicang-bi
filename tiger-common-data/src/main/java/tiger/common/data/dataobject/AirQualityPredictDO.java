package tiger.common.data.dataobject;

import java.sql.Date;

/**
 * Created by lisite on 16-2-29.
 */
public class AirQualityPredictDO extends BaseDO {

    private Date predictdate;

    private int predicthour;

    private int predictday;

    private int predictmonth;

    private int predictyear;

    private double predictaqi;

    private double predictairQualityLevel;

    private double predictfirstElement;

    private double predictco;

    private double predictno2;

    private double predicto3;

    private double predictpm10;

    private double predictpm25;

    private double predictso2;

    public Date getPredictdate() {
        return predictdate;
    }

    public void setPredictdate(Date predictdate) {
        this.predictdate = predictdate;
    }

    public int getPredicthour() {
        return predicthour;
    }

    public void setPredicthour(int predicthour) {
        this.predicthour = predicthour;
    }

    public int getPredictday() {
        return predictday;
    }

    public void setPredictday(int predictday) {
        this.predictday = predictday;
    }

    public int getPredictmonth() {
        return predictmonth;
    }

    public void setPredictmonth(int predictmonth) {
        this.predictmonth = predictmonth;
    }

    public int getPredictyear() {
        return predictyear;
    }

    public void setPredictyear(int predictyear) {
        this.predictyear = predictyear;
    }

    public double getPredictaqi() {
        return predictaqi;
    }

    public void setPredictaqi(double predictaqi) {
        this.predictaqi = predictaqi;
    }

    public double getPredictairQualityLevel() {
        return predictairQualityLevel;
    }

    public void setPredictairQualityLevel(double predictairQualityLevel) {
        this.predictairQualityLevel = predictairQualityLevel;
    }

    public double getPredictfirstElement() {
        return predictfirstElement;
    }

    public void setPredictfirstElement(double predictfirstElement) {
        this.predictfirstElement = predictfirstElement;
    }

    public double getPredictco() {
        return predictco;
    }

    public void setPredictco(double predictco) {
        this.predictco = predictco;
    }

    public double getPredictno2() {
        return predictno2;
    }

    public void setPredictno2(double predictno2) {
        this.predictno2 = predictno2;
    }

    public double getPredicto3() {
        return predicto3;
    }

    public void setPredicto3(double predicto3) {
        this.predicto3 = predicto3;
    }

    public double getPredictpm10() {
        return predictpm10;
    }

    public void setPredictpm10(double predictpm10) {
        this.predictpm10 = predictpm10;
    }

    public double getPredictpm25() {
        return predictpm25;
    }

    public void setPredictpm25(double predictpm25) {
        this.predictpm25 = predictpm25;
    }

    public double getPredictso2() {
        return predictso2;
    }

    public void setPredictso2(double predictso2) {
        this.predictso2 = predictso2;
    }
}
