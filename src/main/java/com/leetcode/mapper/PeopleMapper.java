package com.leetcode.mapper;

import com.leetcode.domain.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface PeopleMapper {

    int insert(People record);

    int insertSelective(People record);

    @Select("SELECT * FROM `people` where people.`name` = #{name} ")
    People selectPeopleByName(String name);

}