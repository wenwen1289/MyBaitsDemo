package com.xiangwen.mapper;

import com.xiangwen.model.Dept;
import org.springframework.stereotype.Component;

@Component
public interface DeptMapper {
    int deleteByPrimaryKey(Integer bumentableid);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer bumentableid);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}