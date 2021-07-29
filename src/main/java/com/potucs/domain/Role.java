package com.potucs.domain;

import lombok.Data;

/**
 * @Auther wangzekun
 * @Date 2021/7/29 15:57
 * @Description
 */
@Data
public class Role {
    private Integer id; //int(10) NOT NULL,
    private String roleName; //varchar(50) DEFAULT NULL,
    private String roleDesc; //varchar(50) DEFAULT NULL,
}
