package com.ygy.service;

import com.ygy.model.Sysuser;

/**
 *
 * @author ygy
 */
public interface UserDao {
    /**
     * 通过username查询
     * @param username
     * @return
     */
    public Sysuser findByUserName(String username);
}
