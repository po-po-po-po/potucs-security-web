package com.potucs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther wangzekun
 * @Date 2021/7/28 11:22
 * @Description
 */
@Controller
@RequestMapping("/product")
public class ProductController{

    /**
     * 商品首页
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 商品添加
     */
    @RequestMapping("/add")
    public String add(){
        return "product/productAdd";
    }

    /**
     * 商品修改
     */
    @RequestMapping("/update")
    public String update(){
        return "product/productUpdate";
    }

    /**
     * 商品列表
     */
    @RequestMapping("/list")
    public String list(){
        return "product/productList";
    }

    /**
     * 商品删除
     */
    @RequestMapping("/delete")
    public String delete(){
        return "product/productDelete";
    }

}
