/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import tiger.core.base.BaseDomain;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountSignUpDomain extends BaseDomain
        implements Serializable{

    private static final long serialVersionUID = 4582810460409373949L;

    private String account;

    private String password;

    private String userName;

    private String invitationCode;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
}
