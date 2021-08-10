package com.potucs;

import com.potucs.domain.Permission;
import com.potucs.domain.User;
import com.potucs.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/29 15:59
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByUsername1(){
        User user = userMapper.findByUsername("po");
        System.out.println(user);
    }

    @Test
    public void testFindPermissionByUsername(){
        List<Permission> list= userMapper.findPermissionByUsername("po");
        for (Permission perm:list) {
            System.out.println(perm.getPermName()+"-"+perm.getPermTag());
        }
    }

    @Test
    public void testUpdatePassword(){
        User user = new User();
        user.setUsername("po");
        //哈希算法+加盐
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode("123456"));
        System.out.println(passwordEncoder.encode("123456"));
        userMapper.updatePassword(user);
    }
}
