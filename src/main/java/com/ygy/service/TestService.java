package com.ygy.service;

import com.ygy.model.Test;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ygy
 * @since 2017/11/23
 */

public interface TestService {
    public void  add(Test test);
   public List<Test> select(int id);
}
