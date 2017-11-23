package com.ygy.service;

import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceIm implements TestService{
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
}
