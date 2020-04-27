package com.leetcode.mapper;

import com.leetcode.domain.People;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface PeopleMapper {
    int insert(People record);

    int insertSelective(People record);
}