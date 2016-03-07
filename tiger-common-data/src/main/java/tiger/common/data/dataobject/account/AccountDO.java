/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject.account;

import tiger.common.data.dataobject.BaseDO;
import tiger.common.util.annotation.CopyIgnore;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountDO extends BaseDO
        implements Serializable{

    private static final long serialVersionUID = 8995472568569340513L;

    private String account;

    private String password;

    private String name;

    private String mobile;

    @CopyIgnore
    private String gender;

    @CopyIgnore
    private String extParams;

    @CopyIgnore
    private String icon;

    @CopyIgnore
    private String status;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExtParams() {
        return extParams;
    }

    public void setExtParams(String extParams) {
        this.extParams = extParams;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
