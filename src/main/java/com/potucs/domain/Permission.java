package com.potucs.domain;

import lombok.Data;

/**
 * @Auther wangzekun
 * @Date 2021/7/29 15:57
 * @Description
 */
@Data
public class Permission {
    private Integer id; //int(10) NOT NULL,
    private String permName; //varchar(50) DEFAULT NULL,
    private String permTag; //varchar(50) DEFAULT NULL,
}
