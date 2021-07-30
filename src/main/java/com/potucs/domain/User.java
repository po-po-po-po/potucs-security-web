package com.potucs.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/29 15:55
 * @Description
 */

@Data
public class User implements UserDetails {
    private Integer id; //int(10) NOT NULL,
    private String username; //varchar(50) DEFAULT NULL,
    private String realname; //varchar(50) DEFAULT NULL,
    private String password; //varchar(50) DEFAULT NULL,
    private Date createDate; //date DEFAULT NULL,
    private Date lastLoginTime; //date DEFAULT NULL,
    private boolean enabled; //int(5) DEFAULT NULL,
    private boolean accountNonExpired; //int(5) DEFAULT NULL,
    private boolean accountNonLocked; //int(5) DEFAULT NULL,
    private boolean credentialsNonExpired; //int(5) DEFAULT NULL,
    //用户拥有的所有权限
    private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
