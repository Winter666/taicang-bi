/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tiger.common.data.enums.GenderEnum;
import tiger.common.util.annotation.CopyIgnore;
import tiger.core.base.BaseDomain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountDomain extends BaseDomain
        implements Serializable {

    private static final long serialVersionUID = -1949993179969595889L;

    private String account;

    @JsonIgnore
    private String password;

    @CopyIgnore
    private GenderEnum gender;

    private String name;

    private String mobile;

    @JsonIgnore
    @CopyIgnore
    private List<RoleDomain> roles;

    @JsonIgnore
    @CopyIgnore
    private List<PermissionDomain> permissions;

    private Date createTime;

    private Date updateTime;

    @CopyIgnore
    private HashMap<String, String> extParams;

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

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<RoleDomain> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDomain> roles) {
        this.roles = roles;
    }

    public List<PermissionDomain> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDomain> permissions) {
        this.permissions = permissions;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public HashMap<String, String> getExtParams() {
        return extParams;
    }

    public void setExtParams(HashMap<String, String> extParams) {
        this.extParams = extParams;
    }
}
