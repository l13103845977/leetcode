package com.leetcode.serviveImpl;

import com.leetcode.domain.People;
import com.leetcode.mapper.PeopleMapper;
import com.leetcode.service.PeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Resource
    private PeopleMapper PeopleMapper;


    @Override
    public int insert(People record) {
        return PeopleMapper.insert(record);
    }

    @Override
    public int insertSelective(People record) {
        return PeopleMapper.insertSelective(record);
    }

    @Override
    public People selectPeopleByName(String name) {
        return PeopleMapper.selectPeopleByName(name);
    }
}
