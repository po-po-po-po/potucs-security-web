package com.potucs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther wangzekun
 * @Date 2021/7/28 11:22
 * @Description
 */
@Controller
public class LoginController {


    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }

    /**
     * 错误页面
     * @return
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
