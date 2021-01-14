package com.example.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.mapper.PersonMapper;
import com.example.mybatisplus.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @GetMapping("/test")
    public Page<Person> test(){
        Page<Person> page = new Page<>(2,5);
        LambdaQueryWrapper<Person> wrapper = Wrappers.lambdaQuery();
        Page<Person> personPage = personMapper.selectPage(page, wrapper);
        return personPage;
    }
}
