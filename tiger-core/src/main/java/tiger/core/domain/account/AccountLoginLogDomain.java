/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import tiger.common.util.StringUtil;
import tiger.core.base.BaseDomain;
import tiger.core.constants.SystemConstants;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountLoginLogDomain extends BaseDomain
        implements Serializable{

    private static final long serialVersionUID = 2104936691936771893L;

    private String ip;

    private String plat;

    private String token;

    private Date create_time;

    private Date expireTime;

    private long accountId;

    public AccountLoginLogDomain() {
    }

    public AccountLoginLogDomain(long accountId, String plat, String ip) {
        this.ip = ip;
        this.plat = StringUtil.substring(plat, SystemConstants.FIRST_INDEX, SystemConstants.PLAT_LAST_INDEX);
        this.accountId = accountId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

}
