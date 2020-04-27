package com.leetcode.serviveImpl;

import com.leetcode.domain.People;
import com.leetcode.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Resource
    private PeopleService peopleService;


    @Override
    public int insert(People record) {
        return peopleService.insert(record);
    }

    @Override
    public int insertSelective(People record) {
        return peopleService.insertSelective(record);
    }
}
