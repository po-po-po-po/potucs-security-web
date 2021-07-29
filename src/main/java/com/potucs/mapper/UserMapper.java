package com.potucs.mapper;

import com.potucs.domain.Permission;
import com.potucs.domain.User;

import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/29 15:51
 * @Description
 */
public interface UserMapper {
    /**
     * 查询当前用户对象
     */
     User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     */
     List<Permission> findPermissionByUsername(String username);

    /**
     * 修改密码
     */
     void updatePassword(User user);
}
