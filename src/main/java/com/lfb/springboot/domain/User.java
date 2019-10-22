package com.lfb.springboot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lufeibin
 * @description: TODO
 * @date 2019/10/22 14:22
 */

@Data
public class User implements Serializable {

    private Integer id;
    private String realname;
    private String username;
    private String password;
    private Integer user_status_id;

}
