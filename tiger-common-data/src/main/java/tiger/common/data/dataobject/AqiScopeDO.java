package tiger.common.data.dataobject;

/**
 * Created by lisite on 16-2-29.
 */
public class AqiScopeDO extends BaseDO {

    private int airQualityLevel;

    private String aqiStatus;

    private String healthEffects;

    private String proposedMeasures;

    public int getAirQualityLevel() {
        return airQualityLevel;
    }

    public void setAirQualityLevel(int airQualityLevel) {
        this.airQualityLevel = airQualityLevel;
    }

    public String getAqiStatus() {
        return aqiStatus;
    }

    public void setAqiStatus(String aqiStatus) {
        this.aqiStatus = aqiStatus;
    }

    public String getHealthEffects() {
        return healthEffects;
    }

    public void setHealthEffects(String healthEffects) {
        this.healthEffects = healthEffects;
    }

    public String getProposedMeasures() {
        return proposedMeasures;
    }

    public void setProposedMeasures(String proposedMeasures) {
        this.proposedMeasures = proposedMeasures;
    }
}
