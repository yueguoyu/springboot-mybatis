package com.ygy.service;

import com.github.pagehelper.PageHelper;
import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ygy
 * 2017/11/26
 * 加了缓存
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    TestMapper mapper;

    @Override
    @CachePut(value = "ygy")
    public void add(Test test) {
        this.mapper.insertBean(test);
    }

    @Override
    @Cacheable(value = "ygy")
    public List<Test> select(int id) {
        return this.mapper.selectById(id);
    }

    @Override
    @CacheEvict(value = "ygy")
    public void delete(int id) {
         this.mapper.deletById(id);
    }

    @Override
    @Cacheable(value = "ygy")
    public List<Test> SelectByName(String name) {
        PageHelper.startPage(2,3);
        return this.mapper.selectByName(name);
    }

    @Override
    @CachePut(value = "ygy")
    public void update(Test test) {
        this.mapper.updateBean(test);
    }
}
