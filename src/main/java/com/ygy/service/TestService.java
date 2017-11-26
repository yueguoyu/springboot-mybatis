package com.ygy.service;

import com.ygy.model.Test;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ygy
 * @since 2017/11/23
 */

public interface TestService {
    /**
     * 增加
     * @param test
     */
    public void  add(Test test);

    /**
     * 查询
     * @param id
     * @return
     */
   public List<Test> select(int id);

    /**
     * 通过id删除
     * @param id
     */
   public void delete(int id);

    /**
     *selectByName
     * @param name
     * @return
     */
   public List<Test> SelectByName(String name);

    /**
     * update date by test
     * @param test
     */
   public void update(Test test);
}
