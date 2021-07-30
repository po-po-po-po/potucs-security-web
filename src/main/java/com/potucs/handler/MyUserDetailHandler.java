package com.potucs.handler;

import com.potucs.domain.Permission;
import com.potucs.domain.User;
import com.potucs.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;



/**
 * @Auther wangzekun
 * @Date 2021/7/28 15:00
 * @Description
 */
public class MyUserDetailHandler implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     /*   //UserDetails: 封装用户数据的接口
        User user = new User( "potucs","123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
        return user;*/
        //根据用户名查询用户信息
        User user = userMapper.findByUsername(username);
        if(user!=null) {
            //根据用户名查询当前用户所有权限
            List<Permission> permList = userMapper.findPermissionByUsername(username);
            //authorities：存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            for (Permission perm : permList) {
                GrantedAuthority authority = new SimpleGrantedAuthority(perm.getPermTag());
                authorities.add(authority);
            }
            //把所有权限赋值给user
            user.setAuthorities(authorities);
        }
        return user;
    }
}
