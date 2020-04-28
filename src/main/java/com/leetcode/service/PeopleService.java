package com.leetcode.service;

import com.leetcode.domain.People;
import com.leetcode.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface PeopleService  {




    public int insert(People record);


    public int insertSelective(People record);

    public People selectPeopleByName(String name);
}
