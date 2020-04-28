package com.leetcode.controller;

import com.leetcode.domain.People;
import com.leetcode.mapper.PeopleMapper;
import com.leetcode.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/people")
public class PeopleController {


    @Resource
    PeopleService peopleService;


    /**
     * 新增
     */
    @RequestMapping("/insert")
    public  String  insert(){

        peopleService.insert(People.builder().name("张三").age(10).build());

        return "docker连接成功";
    }

    /**
     * 新增
     */
    @RequestMapping("/selectPeopleByName")
    public  People  selectPeopleByName(){

       People people= peopleService.selectPeopleByName("张三");
        System.out.println(people);
        return people;
    }
}
