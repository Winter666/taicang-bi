/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence;

import tiger.common.data.dataobject.account.AccountDO;

import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public interface AccountMapper {

    int deleteByPrimaryKey(long id);

    int insert(AccountDO record);

    int insertSelective(AccountDO record);

    AccountDO selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(AccountDO record);

    int updateByPrimaryKey(AccountDO record);

    List<AccountDO> selectByAccount(String account);

}
