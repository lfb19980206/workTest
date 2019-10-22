package com.lfb.springboot.mapper;

import com.lfb.springboot.domain.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from test where id=#{id}")
    Test findTestById(int id);

    @Select("select * from test")
    List<Test> findAllTest();

    @Insert("insert into test(content,answer) values(#{content},#{answer})")
    void addTest(String content, String answer);

    @Delete("delete from test where id=#{id}")
    void deleteTest(int id);

    @Update("update test set content=#{content},answer=#{answer} where id=#{id}")
    void updateTest(Test test);

}
