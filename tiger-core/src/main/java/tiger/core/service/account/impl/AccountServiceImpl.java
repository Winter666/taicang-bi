/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tiger.common.data.dataobject.account.AccountDO;
import tiger.common.data.dataobject.account.PermissionDO;
import tiger.common.data.dataobject.account.RoleDO;
import tiger.common.data.persistence.AccountLoginLogMapper;
import tiger.common.data.persistence.AccountMapper;
import tiger.common.data.persistence.PermissionMapper;
import tiger.common.data.persistence.RoleMapper;
import tiger.core.constants.SystemConstants;
import tiger.core.converter.AccountConvert;
import tiger.core.converter.PermissionConvert;
import tiger.core.converter.RoleConvert;
import tiger.core.domain.account.AccountDomain;
import tiger.core.domain.account.PermissionDomain;
import tiger.core.enums.ErrorCodeEnum;
import tiger.core.exception.AppException;
import tiger.core.service.account.AccountService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Bongo on 16/3/8.
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    PermissionMapper permissionMapper;

    @Autowired
    AccountLoginLogMapper accountLoginLogMapper;

    @Override
    public AccountDomain read(Long accountId){
        AccountDO accountDO = accountMapper.selectByPrimaryKey(accountId);
        if (accountDO == null){
            return null;
        }
        AccountDomain accountDomain = AccountConvert.convert2Domain(accountDO);
        return getRoleAndPermission(accountDomain);
    }

    /**
     * 通过account获取账户信息
     *
     * */
    @Override
    public AccountDomain readByAccount(String account){
        List<AccountDO> accountDOs = accountMapper.selectByAccount(account);
        if (accountDOs.size() > SystemConstants.SIZE_ONE) {
            throw new AppException(ErrorCodeEnum.DB_EXCEPTION);
        } else if (accountDOs.size() == SystemConstants.SIZE_ONE) {
            AccountDO accountDO = accountDOs.get(SystemConstants.FIRST_INDEX);
            AccountDomain accountDomain = AccountConvert.convert2Domain(accountDO);
            return getRoleAndPermission(accountDomain);
        }
        return null;
    }


    //~private method
    /**
     * 获取账户角色权限信息
     *
     * */
    private AccountDomain getRoleAndPermission(AccountDomain accountDomain){

        List<RoleDO> roles = roleMapper.findByAccountId(accountDomain.getId());
        accountDomain.setRoles(RoleConvert.convert2Domain(roles));

        Set<PermissionDomain> permissionDomainSet = new HashSet<>();
        if (!CollectionUtils.isEmpty(roles)) {
            List<Long> roleIds = new ArrayList<>();
            roleIds.addAll(roles.stream().map(RoleDO::getId).collect(Collectors.toSet()));
            List<PermissionDO> permissionDOs = permissionMapper.selectByRoleIds(roleIds);
            permissionDomainSet.addAll(PermissionConvert.convert2Domain(permissionDOs));
        }
        List<PermissionDomain> permissionDomains = new ArrayList<>(permissionDomainSet);
        accountDomain.setPermissions(permissionDomains);

        return accountDomain;

    }

}
