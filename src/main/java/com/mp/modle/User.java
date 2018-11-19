package com.mp.modle;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Mr丶s
 * @ClassName User
 * @Version V1.0
 * @Date 2018/11/19 15:02
 * @Description
 */
@Data
public class User implements Serializable{

    Long id;
    String name;
    Long age;
    String email;

}
