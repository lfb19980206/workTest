package com.lfb.springboot.service.impl;

import com.lfb.springboot.domain.Test;
import com.lfb.springboot.mapper.TestMapper;
import com.lfb.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test findTestById(int id) {
        return testMapper.findTestById(id);
    }

    @Override
    public List<Test> findAllTest() {
        return testMapper.findAllTest();
    }

    @Override
    public void addTest(String content, String answer) {
        testMapper.addTest(content,answer);
    }

    @Override
    public void deleteTest(int id) {
        testMapper.deleteTest(id);
    }

    @Override
    public void updateTest(Test test) {
        testMapper.updateTest(test);
    }
}
