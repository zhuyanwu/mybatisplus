package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.vo.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper extends BaseMapper<Person> {
}
