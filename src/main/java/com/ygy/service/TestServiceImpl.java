package com.ygy.service;

import com.github.pagehelper.PageHelper;
import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ygy
 * 2017/11/26
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    TestMapper mapper;

    @Override
    public void add(Test test) {
        this.mapper.insertBean(test);
    }

    @Override
    public List<Test> select(int id) {
        return this.mapper.selectById(id);
    }

    @Override
    public void delete(int id) {
         this.mapper.deletById(id);
    }

    @Override
    public List<Test> SelectByName(String name) {
        PageHelper.startPage(2,3);
        return this.mapper.selectByName(name);
    }

    @Override
    public void update(Test test) {
        this.mapper.updateBean(test);
    }
}
