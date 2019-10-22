package com.lfb.springboot.service;

import com.lfb.springboot.domain.Test;

import java.util.List;

public interface TestService {

    Test findTestById(int id);

    List<Test> findAllTest();

    void addTest(String content, String answer);

    void deleteTest(int id);

    void updateTest(Test test);

}
