package com.leetcode.service;

import com.leetcode.domain.People;
import com.leetcode.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface PeopleService extends PeopleMapper {



    @Override
    public int insert(People record);

    @Override
    public int insertSelective(People record);

}
