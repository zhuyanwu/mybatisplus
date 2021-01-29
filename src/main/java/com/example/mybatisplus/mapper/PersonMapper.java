package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.vo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper extends BaseMapper<Person> {

     Integer insertBatch( @Param("list") List<Person> list);

     Integer updateBatch (@Param("list") List<Person> list);
}
