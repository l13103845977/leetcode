package com.leetcode.controller;

import com.leetcode.domain.People;
import com.leetcode.service.PeopleService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api("leetcodeAPI接口")
@RestController
@RequestMapping("/people")
public class PeopleController {

    private   final Logger log= LoggerFactory.getLogger(People.class);

    @Resource
    PeopleService peopleService;


    /**
     * 新增
     */
    @ApiOperation(value = "新增用户",notes = "使用介绍",produces = "application/json")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public  void   insert(@RequestBody People people){
        log.info("新增用户:"+people);
        peopleService.insert(people);


    }

    /**
     * 根据姓名查询
     */
    @ApiOperation(value = "根据姓名查询接口",produces = "application/json")
    @RequestMapping(value = "/selectPeopleByName",method = RequestMethod.GET)
    public  People  selectPeopleByName( @RequestParam(required = false) String name){

       People people= peopleService.selectPeopleByName(name);
        System.out.println(people);
        return people;
    }
}
