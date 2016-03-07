/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject.account;

import tiger.common.data.dataobject.BaseDO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountLoginLogDO extends BaseDO implements Serializable{

    private static final long serialVersionUID = 7944459165479170228L;

    private String ip;

    private String plat;

    private String token;

    private Timestamp expireTime;

    private long accountId;

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
