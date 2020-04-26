package com.leetcode.mapper;

import com.leetcode.domain.People;

public interface PeopleMapper {
    int insert(People record);

    int insertSelective(People record);
}