package com.ygy.model;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
@Data
public class Test implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbggenerated Thu Nov 23 17:56:06 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.name
     *
     * @mbggenerated Thu Nov 23 17:56:06 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.data
     *
     * @mbggenerated Thu Nov 23 17:56:06 CST 2017
     */
    private String data;

}